import java.util.Scanner;
public class story
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Hello! You have decided to walk through the maze of Disneyland, where each path will take you to a different disney character homes! Please choose a path to start!\na. North\nb. East\nc. South\nd. West");
		String choice1 = kb.nextLine();
		
		if(choice1.equals("a"))
		{
			System.out.println("Sick, you're going North. Now are we going towards the mountains or the valley?\na. Mountain\nb. Valley");
			String choice2 = kb.nextLine();
			if(choice2.equals("a"))
			{
				System.out.println("Nice! The mountains, long hike. Now are we going into a cave or the summit?\na. Cave\nb. Summit ");
				String choice3 = kb.nextLine();
				if(choice3.equals("a"))
					System.out.println("Wow! You found the Jenies Cave of Wonders from Aladdin!");
				else
					System.out.println("Cool! You walked into Elsa's Ice Castle!");
			}
			else
			{
				System.out.println("Valley? Let's go! Next: Go to the bottom of it or across the bridge?\na. Bottom\nb. Bridge");
				String choice4 = kb.nextLine();
				if(choice4.equals("a"))
					System.out.println("Congrats, you found the Seven Dwarfs Cabin!");
				else
					System.out.println("Spooky! You found the Evil Queen's tree of poisonous apples!");
			}
		}
		else if(choice1.equals("b"))
		{
			System.out.println("East? Rad man, let's go. Walk to through the forest or through the small village?\na. Forest\nb. Village");
			String choice5 = kb.nextLine();
			if(choice5.equals("a"))
			{
				System.out.println("Forest it is! Now, go through the dark forest or the light forest?\na. Dark\nb.Light");
				String choice6 = kb.nextLine();
				if(choice6.equals("a"))
					System.out.println("AHH! You found Maleficent's Castle!");
				else
					System.out.println("Aww, you found Bambi's and Thumper's sleeping ground!");
			}
			else
			{
				System.out.println("Yay! I love the Village! Okay, to the crop fields or the villagers homes?\na. Fields\nb. Homes");
				String choice7 = kb.nextLine();
				if(choice7.equals("a"))
					System.out.println("Sick! You found Jack's Beanstalk! Go climb it!");
				else
					System.out.println("Whoa, you found Cinderella's old home with her stepmother and stepsisters!");
			}
		}
		else if(choice1.equals("c"))
		{
			System.out.println("South it is. Shall we go to the woods or the river?\na. Woods\nb. River");
			String choice8 = kb.nextLine();
			if(choice8.equals("a"))
			{
				System.out.println("WOODS! Should we follow the path or wonder of course?\na. Path\nb. Wonder");
				String choice13 = kb.nextLine();
				if(choice13.equals("a"))
					System.out.println("Whoa, you found Pocohontus' tribe!");
				else
					System.out.println("Cool, there's Auroa's cabin that the faries hid her in from Maleficent!");
			}
			else
			{
				System.out.println("RIVER! Should we go in it or walk along it?\na. In it\nb. Along it");
				String choice9 = kb.nextLine();
				if(choice9.equals("a"))
					System.out.println("Wow! Look, there is Dori trying to find her family!");
				else
					System.out.println("Hey! There's Baloo floating in the river!");
			}
		}
		else
		{
			System.out.println("West it is! I'll follow you. We headed to the ocean or yellow brick road?\na. Ocean\n. Yellow Brick Road");
			String choice10 = kb.nextLine();
			if(choice10.equals("a"))
			{
				System.out.println("Ocean, let's go swim. Shall we stay afloat or go into the deep sea?\na. Afloat\nb. Deep");
				String choice11 = kb.nextLine();
				if(choice11.equals("a"))
					System.out.println("Ariel! Wow she's with Sebastian!");
				else
					System.out.println("Ah Hoy! There's the Black Pearl and Captain Jack Sparrow!");
			}
			else
			{
				System.out.println("Follow the Yellow Brick Road! Shall we go West or to the pumpkin patch?\na. West\nb. Patch");
				String choice12 = kb.nextLine();
				if(choice12.equals("a"))
					System.out.println("Hehehe, you found the Wicked Witch of the West!");
				else
					System.out.println("Hay! The Scarecrow. He's taller in person...");
			}
		}
	}
}