public class Song
{
	public static void main(String[]args)
	{
		Sing("Na", 4);
		Sing("Na", 4);
		Sing("Hey", 3);
		Sing("Goodbye!", 1);
	}
	public static void Sing(String value, int repeat)
	{
		for(int i = 0; i < repeat; i++)
		{
			System.out.printf(value + " ");
		}
		System.out.println();
	}
}