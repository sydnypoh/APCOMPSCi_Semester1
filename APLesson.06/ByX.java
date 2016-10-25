import java.util.Scanner;
public class ByX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an Integer: ");
		int initial = kb.nextInt();
		System.out.println("Please enter a interval in which you wish to count up by: ");
		int interval = kb.nextInt();
		for(int i = 0; i <= initial; i+=interval)
		{
			System.out.printf("%3d\t",i);
		}
	}
}