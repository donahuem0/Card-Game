package Cards;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("Jack", "spades", 11);
		Card c2 = new Card("jack", "Spades", 11);
		
		Card c3 = new Card("Queen", "Diamond", 12);
		
		System.out.println(c1.matches(c2));
		System.out.println(c1.matches(c3 ));
		System.out.println(c3);
		
	}
	
	
	
}
