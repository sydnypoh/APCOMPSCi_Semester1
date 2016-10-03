import java.util.Scanner;
public class Cube2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the side of your cube:");
		double side = kb.nextDouble();
		print(calcSurf(side), side);
	}
	
	public static double calcSurf(double side)
	{
		return 6 * side * side;
	}
	
	public static void print(double sa, double side)
	{
		System.out.printf("The surface ares of the cube with side length " + side + " is %10.5f", sa);
	}
}