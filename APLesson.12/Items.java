import java.lang.Math.*;
public class Items
{
	private String itemManufacturer;
	private String itemName;
	private String itemCategory;
	private int UPCID;
	private double price;
	
	public Items()
	{
		itemManufacturer = "";
		itemName = "";
		itemCategory = "";
		UPCID = 0;
		price = 0;
	}
	
	public Items(String man, String name)
	{
		itemManufacturer = man;
		itemName = name;
		UPCID = (int)(Math.random() * 1000000000) + 1;
		itemCategory = "N/A";
		price = 0;
	}
	
	public Items(String man, String name, String cat, double pri)
	{
		itemManufacturer = man;
		itemName = name;
		UPCID = (int)(Math.random() * 1000000000) + 1;
		itemCategory = cat;
		price = pri;
	}
	
	public void getCatAndPri(String cat, double pri)
	{
		itemCategory = cat;
		price = pri;
	}
	
	public String toString()
	{
		return "Item Info ... \nItem Manufacturer: " + itemManufacturer +
							 "\nItem Name : " + itemName +
							 "\nItem Category: " + itemCategory  +
							 "\nItem Price: $" + price +
							 "\nUPC#: " + UPCID;
	}
}