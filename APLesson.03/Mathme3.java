import java.util.Scanner;

public class Mathme3
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("This is the slope calculator. It will make a calcultion for slope. Please enter your first x value.");
		int one = keyboard.nextInt();
		System.out.println("And your first y value.");
		int two = keyboard.nextInt();
		System.out.println("Now enter your second x value.");
		int three = keyboard.nextInt();
		System.out.println("Now enter you second y value. These two points will help you find slope of the two points");
		int four = keyboard.nextInt();
		
		double n = four - two;
		double d = three - one;
		double slope = n / d;
		
		System.out.println("The answer of your slope is " + slope);
		
	}
}