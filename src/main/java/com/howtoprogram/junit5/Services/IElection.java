package com.howtoprogram.junit5.Services;

public interface IElection {
	
	String getCandidateNameByParty(String party);
	int getNumeroOfVotesByParty(String party);
}
