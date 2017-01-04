import java.util.Scanner;
public class GameGun
{
	static int bulletCount = 96;
	static int CLIPSIZE = 16;
	static int shotCount = CLIPSIZE;
	static String[] clip = new String[CLIPSIZE];
	
	public static void main(String[]args)
	{
		for (int i=0; i<clip.length; i++) {
			clip[i] = " * ";
		}
		while(getbulletCount() > 0 || getShotCount() > 0)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Action: ");
			String action = kb.nextLine();
			if(action.equalsIgnoreCase("R")) {
				reload();
			}
			else if(action.equalsIgnoreCase("S")) {
				shoot();
			}
			else {System.out.println("Try again!");}
			printClip();
			if(getbulletCount() == 0 && getShotCount() == 0)
			{
				System.out.println("You are out of bullets");
			}
		}
	}
	public static int getbulletCount()
	{
		return bulletCount;
	}
	public static int getShotCount()
	{
		return shotCount;
	}
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
			clip[i] = "[]";
	}
	public static void shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount-1] = "[]";
			shotCount--;
			System.out.println("Boom");
		}
		else
			System.out.println("Reload");
	}
	public static void reload()
	{
		if(bulletCount >= CLIPSIZE)
		{
			bulletCount -= CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for(int i = 0; i < shotCount; i ++)
		{
			clip[i] = " * ";
		}
	}
	public static void printClip()
	{
		String output = "";
		output = "Bullets:\t" + bulletCount + "\nClip:\t";
		for (int i = 0; i < CLIPSIZE; i++) 
		{
			output += clip[i];
		}
		System.out.println(output);
	}
}