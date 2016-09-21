import java.util.Scanner;

public class IDCard
{
	public static void main(String[]args)
	{
		IDCard form = new IDCard();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please Enter Your First Name:");
		String right1 = keyboard.nextLine();
		
		System.out.println("Please Enter Your Last Name:");
		String left1 = keyboard.nextLine();
		
		System.out.println("Please Enter Your Employer's Name:");
		String right2 = keyboard.nextLine(); 
		
		System.out.println("Please Enter The Year");
		String left2 = keyboard.nextLine();
		
		System.out.println("Please Enter Your Occupation");
		String right3 = keyboard.nextLine();
		
		System.out.println("Please Enter You Field");
		String left3 = keyboard.nextLine();
		
		System.out.println("*********************************************");
		form.format(right1, left1);
		form.format(right2, left2);
		form.format(right3, left3);
		System.out.println("*********************************************");	
	}
	
	public void format(String right, String left)
	{
		System.out.printf("* %20s %20s *\n", right, left);
	}
}