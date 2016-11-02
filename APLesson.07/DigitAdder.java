import java.util.Scanner;
public class DigitAdder
{
	static int sum = 0;
	static int num;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter in a number: ");
		num = kb.nextInt();
		sumDigits();
		System.out.println("The sum of the digits in " + num + " is " + sum);
	}
	public static void sumDigits()
	{
		int n = num;
		while(n >= 1)
		{
			sum = sum + (n % 10);
			n /= 10;
		}
	}
}