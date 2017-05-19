package Cards;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"10","Jack","Queen"}; 
		String[] suits = {"Spades", "Diamond", "Hearts"};
		int[] values = {10, 11, 12};
		Deck d1 = new Deck(ranks, suits, values);
		
		System.out.println(d1.getSize());
		System.out.println(d1.isEmpty());
		
		for(int i = 0; i < 11; ++i){
			d1.deal();
		}
		
		
		
		System.out.println(d1);
	}
}
