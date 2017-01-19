import java.util.Scanner;
public class Inventory
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the item manufacturer: ");
		String itemMan = kb.nextLine();
		System.out.println("Please enter the item name: ");
		String itemNam = kb.nextLine();
		System.out.println("Will you be entering the item category and item prive? (y or n)");
		String catOrPri = kb.nextLine();
		if(catOrPri.equalsIgnoreCase("y"))
		{
			System.out.println("Please enter the item category: ");
			String itemCat = kb.nextLine();
			System.out.println("Please enter the price: ");
			double itemPri = kb.nextDouble();
			Items ii = new Items(itemMan, itemNam, itemCat, itemPri);
			System.out.println();
			System.out.println(ii);
		}
		else
		{
			System.out.println("Alright, no problem.");
			Items ii2 = new Items(itemMan, itemNam);
			System.out.println();
			System.out.println(ii2);
		}
	}
}