package main;

import com.dgbi.Models.Party;

import java.rmi.RemoteException;
import main.DG_SWIFT_SanctionStub.SearchResults;


public class Engine {

	public Engine() {}
	
	public SearchResults execute(Party[] parties) throws RemoteException
	{
		String endPoint = "http://localhost:90/DG_SNCT/services/DG_SWIFT_Sanction";
		
		DG_SWIFT_SanctionStub engineClient = new DG_SWIFT_SanctionStub();
		
		main.DG_SWIFT_SanctionStub.SearchWatchList searchWatchList = new main.DG_SWIFT_SanctionStub.SearchWatchList();
		String requestID = "Manual Search";
		String localUser = "#Mohamed";
		String sourceUser = "webadmin";
		String sasPassword = "P@ssw0rd";
		String queryString = generateQueryString(parties);
		String fileName = "Manual Search";
		
		searchWatchList.setRequestID(requestID);
		searchWatchList.setSourceUser(sourceUser);
		searchWatchList.setSasPassword(sasPassword);
		searchWatchList.setQueryString(queryString);
		searchWatchList.setFileName(fileName);
		searchWatchList.setLocalUser(localUser);
		
		
		main.DG_SWIFT_SanctionStub.SearchWatchListResponse searchWatchListResponse = engineClient.searchWatchList(searchWatchList);
		SearchResults searchResults = searchWatchListResponse.get_return();
		
		return searchResults;
	}
	
	public String generateQueryString (Party[] parties)
	{
		StringBuilder queryString = new StringBuilder("");
		queryString.append("{\n");
		
		for(int i = 0 ; i < parties.length; i++)
		{
			queryString.append(String.format("    \"%s\":\"%s\",\n", parties[i].getType(), parties[i].getValue()));
		}
		
		
		queryString.append(" \"searchType\":\"T\",\r\n"
				+ "	   \"wildCard\":\"N\",\r\n"
				+ "	   \"searchUser\":\"Mohamed\",\r\n"
				+ "	   \"displayGroup\":[]\n}");
		System.out.println(queryString.toString());
		return queryString.toString();
		
		
	}
	
}
