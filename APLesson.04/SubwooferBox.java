import java.util.Scanner;

public class SubwooferBox
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		SubwooferBox area = new SubwooferBox();
		
		System.out.println("Subwoofer Box is here. Enter everything in inches. Please enter the height of your space:");
		double h = keyboard.nextDouble();
		System.out.println("Please enter the length of your space:");
		double l = keyboard.nextDouble();
		System.out.println("Please enter the width of you space:");
		double w = keyboard.nextDouble();
		
		double ft = area.calcVol(h, l, w);
		
		System.out.printf("The area of your space in cubic feet is about %6.3f", ft);
	}
	
	public double calcVol(double h, double l, double w)
	{
		return ((h*l*w)/1728);
	}
}