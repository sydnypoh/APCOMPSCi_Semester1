import java.util.Scanner;

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hellooo. I'm a curious fellow. Answer these questions for me. What is your name?");
		String name = keyboard.nextLine();

		
		System.out.println("Oh I hate " + name + "s. But oh well, what can you do. How old even are you?");
		int age = keyboard.nextInt();
		
		System.out.println("Wow " + age + " is one of the worst years to live. I'd kill myself if I were you. You need a life, what do you do for fun?");
		String hobby = keyboard.next();
		
		
		System.out.println("Nahh Man " + hobby + " sucks. If you come with me, I can teach you how to live. What do you jam out to?");
		String music = keyboard.nextLine();
		keyboard.nextLine();
		
		System.out.println("Really? " + music + " is your favorite music. You screwed in life. You got any siblings?");
		int sib = keyboard.nextInt();
		
		
		System.out.println(sib + "? You're probably the ugliest out of all of them. Do you at least an idea of what job you want later in life?");
		String life = keyboard.nextLine();
		keyboard.nextLine();
		
		System.out.println("Wow you should be deported from America. You name is " + name + ". You're " + age + " years old. You " + hobby + " for fun. You listen to " + music + " and you want to become a " + life + "? Like actually I know people in jail that I like better than you. You are a waste of my time. Bye");
	}
}