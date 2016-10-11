import java.util.Random;
public class Dice
{
	static int me;
	static int comp;
	
	public static void main(String[]args)
	{
		Random rand = new Random();
		me = rand.nextInt(5)+1;
		comp = rand.nextInt(5)+1;
		System.out.println("You rolled a: " + me);
		System.out.println("Computer rolled a: " + comp);
		rollDice();
	}
	
	public static void rollDice()
	{
		if(me>comp)
			System.out.println("The winner is you!");
		if(me<comp)
			System.out.println("The winner is the computer");
		if(me==comp)
			System.out.println("Tie");
	}
}