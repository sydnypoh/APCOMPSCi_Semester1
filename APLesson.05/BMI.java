import java.util.Scanner;
public class BMI
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your weight in pounds: ");
		double w = kb.nextDouble();
		System.out.println("Please enter your height in inches: ");
		double h = kb.nextDouble();
		
		double bmi = (w*703)/(h*h);
		String condition = "";
		
		if(bmi < 18.5)
			condition = "underweight";
		else if(bmi <= 24.9)
			condition = "normal";
		else if(bmi <= 29.9)
			condition = "overweight";
		else if(bmi <= 34.9)
			condition = "Obese";
		else if(bmi <= 39.9)
			condition = "Very Obese";
		else
			condition = "Morbidly Obese";
		
		System.out.printf("Your BMI is: %4.2f", bmi);
		System.out.println("\nYou are " + condition);
	}
}