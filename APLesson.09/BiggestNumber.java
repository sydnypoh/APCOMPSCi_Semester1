public class BiggestNumber
{
	static int[] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		System.out.print("For the biggest numbers ... ");
		printArray();
		System.out.println("\nTheir biggest number is " + getBiggest(numbers));
	}
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
	}
	public static void printArray()
	{
		for(int number : numbers)
		{
			System.out.print(number + " ");
		}
	}
	public static int getBiggest(int[] numbers)
	{
		int max = 0;
		for(int number : numbers)
		{
			if(number > max)
			{
				max = number;
			}
		}
		return max;
	}
}