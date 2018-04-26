package com.howtoprogram.junit5.Services;

public class Election implements IElection{

	@Override
	public String getCandidateNameByParty(String party) {
		if(party.equals("Axity")) {
			return "Urbano";
		}
		return "Elmer Homero";
	}
	
	@Override
	public int getNumeroOfVotesByParty(String party) {
		if(party.equals("Axity")) {
			return 100;
		}
		return 50;
	}
	
}
