import java.util.Scanner;
public class Rectangle
{
	static double length;
	static double width;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length of your rectangle:");
		length = kb.nextDouble();
		System.out.println("Please enter the width of your rectangle:");
		width = kb.nextDouble();
		calcPerim();
		print();
	}
	
	public static double calcPerim()
	{
		perimeter = 2 * (length + width);
		return perimeter;
	}
	
	public static void print()
	{
		System.out.printf("Your rectangle is %10.5f ft around", perimeter);
	}
}