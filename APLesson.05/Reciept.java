import java.util.Scanner;
public class Reciept
{
	static String item1;
	static String item2;
	static String item3;
	static String item4;
	static String item5;
	static String item6;
	static String item7;
	static String item8;
	static double price1;
	static double price2;
	static double price3;
	static double price4;
	static double price5;
	static double price6;
	static double price7;
	static double price8;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Reciept form = new Reciept();
		
		System.out.println("Please enter your first item:");
		item1 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter your second item");
		item2 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter your third item");
		item3 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		price3 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter your fourth item");
		item4 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		price4 = kb.nextDouble();
		kb.nextLine();
		
		item5 = ("Subtotal");
		item6 = ("Discount");
		item7 = ("Tax");
		item8 = ("Total");
		
		price5 = price1 + price2 + price3 + price4;
		discount();
		price7 = price5 * 0.07;
		price8 = price5 + price7 - price6;
		
		System.out.println("<<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format(item4, price4);
		System.out.println("\n");
		form.format(item5, price5);
		form.format(item6, price6);
		form.format(item7, price7);
		form.format(item8, price8);
		System.out.println("\n__________________________________________");
		System.out.println(" *       Thank you for your support       * ");
		
		
	
	}
	public static void discount()
	{
		if(price5 > 2000)
			price6 = price5 * 0.15;
		if(price5 < 2000)
			price6 = 0;
	}
	public static void format(String item, double price)
	{
		System.out.printf("\n%15s ............ %10.2f", item, price);
	}
}