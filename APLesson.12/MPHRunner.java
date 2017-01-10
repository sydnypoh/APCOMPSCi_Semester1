import java.util.*;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the distance covered by the thing: ");
		int distance = kb.nextInt();
		System.out.println("Please enter the amout of hours it took to cover the distance. Please round down to the nearest hour: ");
		int hours = kb.nextInt();
		System.out.println("Please enter the remaining minutes it took to cover the distance: ");
		int minutes = kb.nextInt();
		double time = hours + (minutes/60);
		
		MilesPerHour drunkvan = new MilesPerHour(distance, hours, minutes);
		
		
		System.out.println(distance + " miles per hour in " + time + " hours = " + drunkvan.getmph() + " mph ");
		drunkvan.setValues(distance, hours, minutes);
		System.out.println(distance + " miles per hour in " + time + " hours = " + drunkvan.getmph() + " mph ");
	}
}
