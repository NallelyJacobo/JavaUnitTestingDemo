package com.howtoprogram.junit5.Services;

public class ElectionMock implements IElection{
	@Override
	public String getCandidateNameByParty(String party) {return "Prueba";}
	
	@Override
	public int getNumeroOfVotesByParty(String party) {
		return 10;
	}
}
