public class AverageNumbers
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100) + 1;
		}
		System.out.print("Numbers...");
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
		System.out.println(" ");
		System.out.println("The average of the above numbers is..." + average(numbers));
	}
	public static int average(int[] num)
	{
		int sum = 0;
		for(int nums : num)
		{
			sum += nums;
		}
		return sum/10;
	}
}