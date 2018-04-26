package com.howtoprogram.junit5.Services;

import com.howtoprogram.junit5.Services.Election;
import com.howtoprogram.junit5.Services.ElectionMock;
import com.howtoprogram.junit5.Services.IElection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock; 
import static org.mockito.Mockito.when;

public class MenuTest {
	
	@Test
	void getNameByPartyTests() {
		IElection election = new ElectionMock();
		
		String candidateName = election.getCandidateNameByParty("Axity");
		
		int numOfVotes = election.getNumeroOfVotesByParty("Axity");
		
		assertEquals("Prueba", candidateName);
		assertEquals(10, numOfVotes);
	}
	
	@Test
	void getNameByPartyTestsMockito() {
		IElection election = mock(Election.class);
		
		when(election.getCandidateNameByParty("Otra cosa")).thenReturn("Arturo");
		when(election.getNumeroOfVotesByParty("")).thenReturn(0);
		
		String candidateName = election.getCandidateNameByParty("Otra cosa");
		
		int numOfVotes = election.getNumeroOfVotesByParty("");
		
		assertEquals("Arturo",candidateName);
		assertEquals(0,numOfVotes);
	}
}