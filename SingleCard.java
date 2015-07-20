package cardGame;

public class SingleCard {
	
		public final int suit;
		public final int rank;
		
		//kinds of suit
		public final static int Spade = 1;
		public final static int Heart = 2;
		public final static int Diamond = 3;
		public final static int Club = 4;
		
		//kinds of rank
		public final static int ACE = 1;
		public final static int Deuce = 2;
		public final static int Three = 3;
		public final static int Four= 4;
		public final static int Five = 5;
		public final static int Six = 6;
		public final static int Seven = 7;
		public final static int Eight = 8;
		public final static int Nine = 9;
		public final static int Ten = 10;
		public final static int Jack = 11;
		public final static int Queen = 12;
		public final static int King = 13;
		
		public void printCard(){
			 System.out.println( suittoString(suit)+","+ ranktoString(rank) );
		 }
		
		
		public SingleCard(int su, int ra){
			
			assert isValidRank(ra);
			assert isValidSuit(su);
			this.rank=ra;
			this.suit=su;
			
		}
		
		public int getsuit(){
			return suit;
		}
		public int getrank(){
			return rank;
		}
		
		public static boolean isValidRank(int r){
			return ACE <= r && r <= King;	
		}
		
		public static boolean isValidSuit(int s){
			return Spade <= s && s <= Club;
			}
		
		public static String ranktoString(int ran){
			switch(ran){
			case ACE:
				return "Ace";
			case Deuce:
				return "Deuce";
			case Three:
				return "Three";
			case Four:
				return "Four";
			case Five:
				return "Five";
			case Six:
				return "Six";
			case Seven:
				return "Seven";
			case Eight:
				return "Eight";
			case Nine:
				return "Nine";
			case Ten:
				return "Ten";
			case Jack:
				return "Jack";
			case Queen:
				return "Queen";
			case King:
				return "King";
		    default:
		    	return null;
			}
					
		} 
		public static String suittoString(int sui){
			switch(sui){
				case Spade:
					return "Spade";
				case Heart:
					return "Heart";
				case Diamond:
					return "Diamond";
				case Club:
					return "Club";
				default:
				    return null;
		     }
	     }
		 
		public boolean compareTo(SingleCard other) {
			SingleCard card = (SingleCard) other;
			if (this.getsuit() == card.getsuit()){ 
				System.out.println("---------Same suit-------");
			    return true;
			}
			else {
				return false;
		    }
	    }
}
