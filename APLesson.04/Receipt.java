import java.util.Scanner;

public class Receipt
{
	public static void main(String[]args)
	{
		Receipt form = new Receipt();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item one:");
		String item1 = keyboard.nextLine();
		
		System.out.println("Please enter price:");
		double price1 = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println("Please enter item two:");
		String item2 = keyboard.nextLine();
		
		System.out.println("Please enter price:");
		double price2 = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println("Please enter item three:");
		String item3 = keyboard.nextLine();
		
		System.out.println("Please enter price:");
		double price3 = keyboard.nextDouble();
		keyboard.nextLine();
		
		String item4 = "Subtotal:";
		double price4 = price1 + price2 + price3;
		String item5 = "Tax:";
		double price5 = price4 * 0.07;
		String item6 = "Total:";
		double price6 = price4 + price5;
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		System.out.println("\n");
		form.format(item4, price4);
		form.format(item5, price5);
		form.format(item6, price6);
		System.out.println("\n__________________________________________");
		System.out.println(" * Thank you for your support * ");
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n*%15s .......     %10.2f", item, price);
	}
	
}