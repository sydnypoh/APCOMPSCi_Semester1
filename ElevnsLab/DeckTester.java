/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
		String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
		int[] values = {2,3,4,5,6,7,8,9,10,10,10,10,11};
		String[] ranks1 = {"five","six","seven"};
		String[] suits1 = {"Spades", "Clubs", "Hearts", "Diamonds"};
		int[] values1 = {5,6,7};
		String[] ranks2 = {"eight","nine","ten"};
		String[] suits2 = {"Spades", "Clubs", "Hearts", "Diamonds"};
		int[] values2 = {8,9,10};
		Deck d = new Deck(ranks, suits, values);
		Deck d1 = new Deck(ranks1, suits1, values1);
		Deck d2 = new Deck(ranks2, suits2, values2);
		
		System.out.println(d);


	}
}


