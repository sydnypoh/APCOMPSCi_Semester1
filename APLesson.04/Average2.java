import java.util.Scanner;
public class Average2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first number:");
		double num1 = kb.nextDouble();
		System.out.println("Please enter your second number:");
		double num2 = kb.nextDouble();
		System.out.println("Please enter your third number:");
		double num3 = kb.nextDouble();
		print(average(num1, num2, num3), num1,  num2,  num3);
	}
	
	public static double average(double num1, double num2, double num3)
	{
		return (num1+num2+num3)/3;
	}
	
	public static void print(double avg,double num1, double num2, double num3)
	{
		System.out.printf("The average of " + num1 + " , " + num2 + " ,and " + num3 + " is %10.5f", avg);
	}
}