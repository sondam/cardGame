package cardGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCards {
	//SingleCard(suit,rank)
	//SingleCard sc1= new SingleCard(4,3);

		@Test
	public void test() {
	
	assert SingleCard.suittoString(SingleCard.Diamond) == "Diamonds";
			 
	assertEquals(SingleCard.ranktoString(SingleCard.ACE),"Ace");
	}
		
}
