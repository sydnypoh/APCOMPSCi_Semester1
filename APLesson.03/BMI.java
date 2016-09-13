import java.util.Scanner;

public class BMI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hey, you lookin a little fat. How much do you weigh?");
		int weight = keyboard.nextInt();
		
		System.out.println("Uhhh okay you look heavier than that. And your hieght in inches?");
		int height = keyboard.nextInt();
		
		int n = 703 * weight;
		int d = height * height;
		double bmi = n / d;
		
		System.out.println("Whoaa man. I leanred how to calculate BMI in school and because I'm so smart I did it in my head. You BMI is " + bmi);
		
	}
}