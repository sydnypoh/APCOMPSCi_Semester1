import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the x location for your first point:");
		int x1 = kb.nextInt();
		System.out.println("Please enter the y location for your first point:");
		int y1 = kb.nextInt();
		System.out.println("Please enter the x location for your second point");
		int x2 = kb.nextInt();
		System.out.println("Please enter the y location for your second point");
		int y2 = kb.nextInt();
		
		Distance algebra = new Distance(x1, y1, x2, y2);
		
		System.out.println("Distance = " + algebra.getDist());
		algebra.setValues(x1, y1, x2, y2);
		System.out.println("Distance = " + algebra.getDist());
		
	}
}