public class DiceRoll
{
	
	public static void main(String[]args)
	{
		int player = (int)(Math.random()*6)+1;
		int computer = (int)(Math.random()*6)+1;
		
		String winner = rollDice(player, computer);
		
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("And the winner is... " + winner);
	}
	
	public static String rollDice(int player, int computer)
	{
		
		if(player > computer)
			return "Player";
		if(player < computer)
			return "Computer";
		else
			return "TIE";
		
	}
}