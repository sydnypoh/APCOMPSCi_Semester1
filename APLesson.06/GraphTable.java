import java.util.Scanner;
public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer for the table: ");
		int initial = kb.nextInt();
		System.out.println("Please enter how many rows you want for your table: ");
		int rows = kb.nextInt();
		for(int i = 1; i <= rows; i++)
		{
			System.out.printf("%3d | %6d\n", i, i*initial);
		}
	}
}