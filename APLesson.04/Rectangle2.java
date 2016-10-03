import java.util.Scanner;
public class Rectangle2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of your rectangle:");
		double l = kb.nextDouble();
		System.out.println("Enter the width of your rectangle:");
		double w = kb.nextDouble();
		print(calcPerim(l, w));
	}
	
	public static double calcPerim(double l, double w)
	{
		return 2 * (l + w);
	}
	
	public static void print(double perimeter)
	{
		System.out.printf("Your rectangle is %10.5f ft around.", perimeter);
	}
}