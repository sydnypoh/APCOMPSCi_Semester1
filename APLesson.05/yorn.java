import java.util.Scanner;
public class yorn
{
	static Scanner kb;
	public static void main(String[]args)
	{
		recursion();
	}
	
	public static void recursion()
	{
		System.out.println("Would you like to do some recursion? ");
		String choice = kb.next();
		if(choice.equals("Y") || choice.equals("n"))
		{
			if(choice.equals("Y"))
				System.out.println("Yay! let's do some recursion!");
			else
				System.out.println("You Spoiled the fun");
		}
		else
			System.out.println("Please enter Y or N");
		recursion();
	}
}