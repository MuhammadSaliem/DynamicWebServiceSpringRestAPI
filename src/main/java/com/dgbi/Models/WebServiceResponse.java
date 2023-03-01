package com.dgbi.Models;
import main.DG_SWIFT_SanctionStub.SearchResults;

public class WebServiceResponse {
	String reference;
	String status;
	String errorMessage;
	String errorCode;
	SearchResults searchResults;
	
	public WebServiceResponse() {

	}
	
	public WebServiceResponse(String reference, String status,String errorCode, String errorMessage, SearchResults searchResults) {
		super();
		this.reference = reference;
		this.status = status;
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.searchResults = searchResults;
		
	}
	
	
    public WebServiceResponse generateSuccessResponse(String reference) {
    	
        this.reference = reference;
        this.status = "Success";
        this.errorMessage = " ";
        this.errorCode = " ";
    	
    	return this;
    }
    
    public WebServiceResponse generateFailureResponse(String reference, String errorMessage) {
    	
        this.reference = reference;
        this.status = "Fail";
        this.errorMessage = errorMessage;
        this.errorCode = " ";
    	
    	return this;
    }
	
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public SearchResults getSearchResults() {
		return searchResults;
	}

	public void setSearchResults(SearchResults searchResults) {
		this.searchResults = searchResults;
	}
	
}
