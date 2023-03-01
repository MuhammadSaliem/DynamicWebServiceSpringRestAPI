package com.dgbi.partyextractor;

import java.rmi.RemoteException;

import com.dgbi.Models.Party;
import com.dgbi.partyextractor.PartyExtractorStub.ExtractPartiesService;



public class PartyExtractor {

	public Party[] extractParties(String source_username, String password, String request) throws RemoteException, PartyExtractorParseExceptionException, PartyExtractorSQLExceptionException {
		PartyExtractorStub stub = new PartyExtractorStub();
		ExtractPartiesService req = new ExtractPartiesService();
		
		req.setUsername(source_username);
		req.setPassword(password);
		req.setQueryString(request);
		
		
		com.dgbi.partyextractor.PartyExtractorStub.Party[] parties = (stub.extractPartiesService(req)).get_return();
		
		
		return map(parties);
	}
	
	public static Party[] map(com.dgbi.partyextractor.PartyExtractorStub.Party[] parties)
	{
		Party[] list = new Party[parties.length];
		int counter = 0;
		
		for( com.dgbi.partyextractor.PartyExtractorStub.Party party : parties)
		{
			list[counter++] = new Party(party.getType(), party.getValue());
		}
		return list;
	}


}
