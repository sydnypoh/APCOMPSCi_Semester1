import java.util.Scanner;
public class GameHealth
{
	static int HEALTHLOAD = 6, healthCount = HEALTHLOAD;
	static String[] health = new String[HEALTHLOAD];
		
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		for (int i=0; i<health.length; i++) 
		{
			health[i] = "@";
		}
		while(!(turn.equalsIgnoreCase("Q")) && healthCount > 0)
		{
			System.out.print("Your turn! Hit Enter when ready: ");
			turn = kb.nextLine();
			int damage = (int)(Math.random()*2)+1, amount = (int)(Math.random()*6)+1;
			takeDamage(damage, amount);
			printClip();
		}
		System.out.println("You died!!!");
	}
	public static void takeDamage(int dmg, int amt)
	{
		if(dmg == 1)
		{
			System.out.println("Taking " + amt + " damage!");
			healthCount -= amt;
		}
		else
		{
			if((healthCount + amt) < HEALTHLOAD) 
			{
				healthCount += amt;
			}
			else 
			{
				healthCount = HEALTHLOAD;
			}
			System.out.println("Power Up " + amt + "!");
		}
	}
	public static void printClip()
	{
		String output = "";
		output += "Health:\t";
		for(int i = 0; i < HEALTHLOAD; i++)
		{
			if(i < healthCount) 
			{
				health[i] = "@";
			}
			else 
			{
				health[i] = "[]";
			}
			output += health[i] + " ";
		}
		System.out.println(output);
	}
}