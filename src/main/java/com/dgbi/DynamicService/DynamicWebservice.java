package com.dgbi.DynamicService;


import com.dgbi.Models.Party;
import com.dgbi.Models.Request;
import com.dgbi.Models.RequestParam;
import com.dgbi.Models.WebServiceResponse;

import main.Engine;
import com.dgbi.partyextractor.PartyExtractor;
import com.dgbi.service.Service;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import main.DG_SWIFT_SanctionStub.SearchResults;

public class DynamicWebservice {

    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m";
    
    private WebServiceResponse response;
    
    public DynamicWebservice()
    {
    	response = new WebServiceResponse();
    }

    // refactoring
    private boolean validateJson(JSONObject request, String reference, String type) throws Exception {

    	if(isRequestExisted(reference))
    	{
    		return false;
    	}

    	boolean isTypeExisted = new Service().isTypeExisted(type);
        // validate type
        if(!isTypeExisted)
        {
            displayErrorMessageToConsole(String.format("Type \"%s\" is not exited!", type));
            response.generateFailureResponse(reference, String.format("Type \"%s\" is not exited!", type));
            //throw new IllegalArgumentException(String.format("Type \"%s\" is not exited!", (String) jsonObj.get("type")));
            return false;
        }
        
    	boolean isSourceUserExisted = new Service().isSourceUserExisted(type);
        // validate type
        if(!isSourceUserExisted)
        {
            displayErrorMessageToConsole(String.format("Type \"%s\" has no source_user!", type));
            response.generateFailureResponse(reference, String.format("Type \"%s\" has no source_user!", type));
            return false;
//            throw new IllegalArgumentException(String.format("Type \"%s\" has not source_user!", (String) jsonObj.get("type")));
        }
        
        

        List<RequestParam> paramList =  new Service().selectAllParams(type);

        // params from DB
        List<String> typeParams = new Service().getParamsNames(paramList);

        // params from request
        List<String> requestParams = new ArrayList<String>();

        Map requestMap = (Map)request;
        Iterator<Map.Entry> itr1 = requestMap.entrySet().iterator();

//        List<String> foreignParams = new ArrayList<>();

        // Validate type params
        while(itr1.hasNext())
        {
            Map.Entry pair = itr1.next();

            //Add keys to a separate list
            requestParams.add((String)pair.getKey());

            //validate that each request param belongs to the type params
//            if(!typeParams.contains(pair.getKey()))
//                foreignParams.add((String)pair.getKey());

        }

//        if(!foreignParams.isEmpty())
//        {
//            displayErrorMessageToConsole(String.format("The %s "+ (foreignParams.size() > 1 ? "parameters do" : "parameter does") +" not belong to type \"%s\"", foreignParams.toString(), (String)jsonObj.get("type")));
//            return false;
//        }


        List<String> missingParams = new ArrayList<String>();

        // Validate mandatory params
        for(RequestParam param : paramList)
        {
            if(param.isMandatory() && !requestParams.contains(param.getParam_name()))
            {
                missingParams.add(param.getParam_name());
            }
        }

        if(missingParams.size() > 0)
        {
            displayErrorMessageToConsole("The following mandatory parameters are missing " + missingParams.toString());
            response.generateFailureResponse(reference, "The following mandatory parameters are missing " + missingParams.toString());
            return false;
//            throw new Exception("The following mandatory parameters are missing " + missingParams.toString());
        }

        return true;
    }

    private Request convertJsonToRequestObject(JSONObject obj)
    {

        Request req = new Request();
        req.setReference((String)obj.get("ref"));
        req.setType((String)obj.get("type"));

        String requestParams = ((Map) obj.get("request")).toString();
        req.setRequestParams(requestParams);

        return req;
    }

    private String generateQueryString(JSONObject request)
    {
        JSONObject obj = new JSONObject();

        Map req = ((Map)request.get("request"));
        obj.put("request", req);

        //System.out.println("\nQueryString ... \n" + obj.toString());
        return obj.toString();
    }

    public WebServiceResponse requestPreparator(String request, String reference, String type) throws Exception {

//    	WebServiceResponse response = new WebServiceResponse();

        JSONParser parser = new JSONParser();
        JSONObject obj = (JSONObject) parser.parse(request);

        // Cheak if ref already existed
//        String refId = ((String) obj.get("ref"));
//        Request requestObj = new Service().selectRequest(reference);
//
//        if(requestObj != null)
//        {
////            System.out.println("request already existed!");
//            displayErrorMessageToConsole("Reference key already existed!");
//        	response.generateFailureResponse(reference, "Reference key already existed!");
//        	return response;
//        }

        // validate Json
        boolean validationResult = validateJson(obj, reference, type);
        try
        {
            if(validationResult)
            {
                //displaySuccessMessageToConsole("Request validated successfully");
//                String queryString = generateQueryString(obj);

                String source_username = new Service().selectSourceUsername(type);
                String password = "secret";

                Party[] parties = new PartyExtractor().extractParties(source_username, password , request);

                SearchResults results = new Engine().execute(parties);

                if(!results.getSuccess())
                    response.generateFailureResponse(reference, results.getErrorMsg());

                else
                {
                    response.setSearchResults(results);

                    Request req = new Request(reference, type, request);
                    new Service().InsertRequest(req);

                    //displaySuccessMessageToConsole("Processed request successfully");
                    response.generateSuccessResponse(reference);
                }

            }

        }
        catch(Exception ex)
        {
            displayErrorMessageToConsole(ex.getMessage());
            response.generateFailureResponse(reference, ex.getMessage());

        }

        return response;

    }

    
    private boolean isRequestExisted(String reference) throws FileNotFoundException, IOException {
        Request requestObj = new Service().selectRequest(reference);

        if(requestObj != null)
        {
//            System.out.println("request already existed!");
            displayErrorMessageToConsole("Reference key already existed!");
        	response.generateFailureResponse(reference, "Reference key already existed!");
        	return true;
        }
        return false;
    }

    
    private void displayErrorMessageToConsole(String text)
    {
        System.out.println(ANSI_RED + text + ANSI_RESET);
    }

    private void displaySuccessMessageToConsole(String text)
    {
        System.out.println(ANSI_GREEN + text + ANSI_RESET);
    }
}
