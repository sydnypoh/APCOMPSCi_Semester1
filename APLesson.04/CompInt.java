import java.util.Scanner;

public class CompInt
{
	public static void main(String[]args)
	{
		CompInt interst = new CompInt();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is you interest rate?");
		double r = keyboard.nextDouble();
		System.out.println("What is the amount of money you intend to borrow?");
		double p = keyboard.nextDouble();
		System.out.println("How many times is the loan compounded per year?");
		double n = keyboard.nextDouble();
		System.out.println("How long is the life of the loan? In years.");
		double t = keyboard.nextDouble();
		
		double ci = interst.answer(r, p, n, t);
		
		System.out.printf("Your total monthly payment is $%5.2f", ci);
		
	}
	
	public double answer(double r, double p, double n, double t)
	{
		return ((p * Math.pow(1 + (r / n), n * t)) / (12 * t));
	}
}