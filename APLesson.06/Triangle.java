import java.util.Scanner;
public class Triangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your word: ");
		String word = kb.next();
		for(int i = word.length(); i > 0; i--)
		{
			System.out.println(word.substring(0,i));
		}
	}
}