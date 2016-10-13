import java.util.Scanner;
public class GPA
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your Science Grade: ");
		String science = kb.nextLine();
		System.out.println("Please enter your Math Grade: ");
		String math = kb.nextLine();
		System.out.println("Please enter your English Grade: ");
		String english = kb.nextLine();
		System.out.println("Please enter your History Grade: ");
		String history = kb.nextLine();
		System.out.println("Please enter your PE Grade: ");
		String pe = kb.nextLine();
		System.out.println("Please enter you Art Grade: ");
		String art = kb.nextLine();
		System.out.println("Please enter your Lunch Grade: ");
		String lunch = kb.nextLine();
		
		
		double sum = calcPoints(science) + calcPoints(math) + calcPoints(english) + calcPoints(history) + calcPoints(pe) + calcPoints(art) + calcPoints(lunch);
		double gpa = sum / 7;
		System.out.printf("Your GPA is %4.3f", gpa);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		else
			return 0.0;
	}
}