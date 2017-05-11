/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card kingOfHearts = new Card("King","Hearts",13);
		Card queenOfSpades = new Card("Queen","Spades",12);
		Card aceOfSpades = new Card("Ace","Spades",1);
		System.out.println(kingOfHearts.toString());
		System.out.println(kingOfHearts.matches(aceOfSpades));
	}
}
