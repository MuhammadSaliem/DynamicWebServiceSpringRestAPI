package main;

import com.dgbi.DynamicService.DynamicWebservice;
import main.DG_SWIFT_SanctionStub.*;
public class testEngine {

	public static void main(String[] args) throws Exception {
//		Party[] parties = new Party[1];
//		parties[0] = new Party("name", "Ahmed");
//		
//		SearchResults results = new Engine().execute(parties);
//		for(WatchListEntity watchListEntity : results.getWatchListMatches())
//		{
//			System.out.println(watchListEntity);
//
//		}
		
		DynamicWebservice service = new DynamicWebservice();
		SearchResults results = service.requestPreparator("{\"name\":\"Ahmed\"}", "1522023#1", "SWIFT").getSearchResults();
		
		for(WatchListEntity watchListEntity : results.getWatchListMatches())
		{
			System.out.println(watchListEntity);

		}
		
	}

}
