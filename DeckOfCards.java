package cardGame;

import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards {
	Random randomGenerator = new Random();

public  static	ArrayList<SingleCard> deckCard   = new ArrayList<SingleCard>();
	
	
	public DeckOfCards(){
		 for (int j = 1; j < 5; j++){	
			for (int i = 1; i < 14; i++){
			    SingleCard s = new SingleCard(j, i);
			    deckCard.add(s);
			}
		 }
	}
	
	public void displayDeck(){
		for (SingleCard element:deckCard){
			element.printCard();
		}
	}
	public SingleCard randomCard(){
	//	System.out.println(deckCard.size());
		int index = randomGenerator.nextInt(deckCard.size());
	    SingleCard randomcard = deckCard.get(index);
        deckCard.remove(index);
    //  randomcard.printCard();
        return randomcard;
		
	}
	
	
	
}