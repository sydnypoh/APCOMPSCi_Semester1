import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the color of your hair: ");
		String hair = kb.nextLine();
		System.out.println("Please enter the color of your eyes: ");
		String eyes = kb.nextLine();
		System.out.println("Please enter the color of your skin: ");
		String skin = kb.nextLine();
		System.out.println("Please enter the color of your friend's hair: ");
		String nhair = kb.nextLine();
		System.out.println("Please enter the color of your friend's eyes: ");
		String neyes = kb.nextLine();
		System.out.println("Please enter the color of your friend's skin: ");
		String nskin = kb.nextLine();
		
		Human race = new Human(hair, eyes, skin);
		
		System.out.println("");
		System.out.println("My info... \nHair:   " + race.getHair() + "\nEyes:   " + race.getEyes() + "\nSkin:   " + race.getSkin());
		System.out.println("");
		race.setHES(nhair, neyes, nskin);
		System.out.println("Friend's info... \nHair:   " + race.getHair() + "\nEyes:   " + race.getEyes() + "\nSkin:   " + race.getSkin());
	}
}