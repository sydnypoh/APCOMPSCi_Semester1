import java.util.Random;
public class RandNum
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int num = rand.nextInt(3)+1;
		System.out.println(num);
		
	}
}