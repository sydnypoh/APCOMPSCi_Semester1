import java.util.Scanner;
public class Circle2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius of your circle:");
		double r = kb.nextDouble();
		print(calcArea(r), r);
	}
	
	public static double calcArea(double r)
	{
		return 3.14159265 * r * r;
	}
	
	public static void print(double area, double r)
	{
		System.out.printf("The area of a circle with a radius of " + r + " is %10.5f", area);
	}
}