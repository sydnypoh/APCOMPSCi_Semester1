import java.util.Scanner;
public class password
{
	static Scanner kb = new Scanner(System.in);
	static String username;
	static String password;
	public static void main(String[]args)
	{
		username = "sydnypoh";
		password = "gogopohpoh";
		passCheck();
	}
	public static void passCheck()
	{
		System.out.println("Please enter your username: ");
		String uimput = kb.nextLine();
		System.out.println("Please enter you password: ");
		String pimput = kb.nextLine();
		if(uimput.equals(username) && pimput.equals(password))
		{
			System.out.println("Access is granted!");
		}
		else if(uimput.equals(username) && !pimput.equals(password))
		{
			System.out.println("Your password is incorrect. Please try again.");
			passCheck();
		}
		else if(!uimput.equals(username) && pimput.equals(password))
		{
			System.out.println("Your username is incorrect. Please try again.");
			passCheck();
		}
		else
		{
			System.out.println("Your username and password are incorrect. Please try again.");
			passCheck();	
		}
	}
}