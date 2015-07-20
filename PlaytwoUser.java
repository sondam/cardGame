package cardGame;

import java.util.ArrayList;

public class PlaytwoUser {
	int user1points=0;
	int user2points=0;
	
	ArrayList<SingleCard> user1   = new ArrayList<SingleCard>();
	ArrayList<SingleCard> temp   = new ArrayList<SingleCard>();
	ArrayList<SingleCard> user2   = new ArrayList<SingleCard>();
	 
	DeckOfCards deck= new DeckOfCards();
	public void play(){ 
	  while(DeckOfCards.deckCard.size() > 0){
			SingleCard c = deck.randomCard();
			System.out.print("User 1--");
			c.printCard();
			temp.add(c);				
			if(temp.size()>2 && (temp.get(temp.size()-2)).compareTo(c)){
				// user1points=0;
				 user1.addAll(temp);
				 temp.clear();
				 for (SingleCard element:user1){   
				    	System.out.println(element.getrank());
					    user1points=user1points+element.getrank();
					    }
					 System.out.println("User1 points "+user1points);			   
					 user1.clear();	
              } 
			                  	
	
			SingleCard c1 = deck.randomCard();	
			System.out.print("User 2--");
			c1.printCard();
			temp.add(c1);
					if(c.compareTo(c1)){
					 //  user2points=0;
					   user2.addAll(temp);
					   temp.clear();
					   
						 for (SingleCard element:user2){ 
						    System.out.println(element.getrank());
						    user2points=user2points+element.getrank();
						    }
						 System.out.println("User2 points "+user2points);			   
						 user2.clear();
                     } 
	     }		
      }
}

