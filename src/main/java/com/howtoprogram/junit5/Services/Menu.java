package com.howtoprogram.junit5.Services;

public class Menu {
	public static void main(String[] args) {
		IElection election = new Election();
		
		String candidateName = election.getCandidateNameByParty("Axity");
		
		int numOfVotes = election.getNumeroOfVotesByParty("Axity");
		
		System.out.println(String.format("Name: %s - Votes: %d", candidateName, numOfVotes));
	}
}
