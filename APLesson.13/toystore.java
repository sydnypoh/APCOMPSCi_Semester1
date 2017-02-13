import java.util.*;
public class toystore
{
	ArrayList<Toy> inventory;
	
	public toystore()
	{
		inventory = new ArrayList<>();
	}
	
	public toystore(String Toy)
	{
		loadtoys(Toy);
	}
	
	public void loadtoys(String toyz)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(toyz.split(", ")));
		inventory = new ArrayList<Toy>();
		
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			Toy t = getthattoy(name);
			if(t == null)
			{
				if(type.equalsIgnoreCase("car"))
				{
					inventory.add(new Car(name));
				}
				if(type.equalsIgnoreCase("af"))
				{
					inventory.add(new AFigure(name));
				}
			}
			else
			{
				t.setCount(t.getCount()+1);
			}
		}
	}
	
	public Toy getthattoy(String name)
	{
		for(Toy t : inventory)
		{
			if(t.getName().equalsIgnoreCase(name))
			{
				return t;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy t : inventory)
		{
			if(max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int x = 0;
		int y = 0;
		for(Toy b : inventory)
		{
			if(b.getType().equalsIgnoreCase("car"))
			{
				x++;
			}
			else if (b.getType().equalsIgnoreCase("afigure"))
			{
				y++;
			}
		}
		if(x < y)
		{
			return "car";
		}
		else
		{
			return "action figure";
		}
	}
	
	public String toString()
	{
		return "" + inventory;
	}
	
}