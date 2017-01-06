public class UserName
{
	//instance variables
	private String userName, firstName, lastName;
	
	//Default Constructor
	public UserName()
	{
		//default values for instance var
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	//Constructor with parameters
	public UserName(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	//Modifier
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	//Accessors
	public String getUsername()
	{
		return userName;
	}
	
	public String getFirstname()
	{
		return firstName;
	}
	
	public String getLastname()
	{
		return lastName;
	}
	
	public static void main(String[]args)
	{
		UserName object = new UserName("proHandom", "Professor", "handsom");
		
		System.out.println("<<<<<<<<<< USER INFO >>>>>>>>>>>>>");
		System.out.println("Name: " + object.getFirstname() + " " + object.getLastname());
		System.out.println("User Name:" + object.getUsername());
		
		UserName object1 = new UserName();
		
		System.out.println("<<<<<<<<<< USER INFO >>>>>>>>>>>>>");
		System.out.println("Name: " + object1.getFirstname() + " " + object1.getLastname());
		System.out.println("User Name:" + object1.getUsername());
		
		object.setUserName("profhandsom");
		System.out.println("<<<<<<<<<< USER INFO >>>>>>>>>>>>>");
		System.out.println("Name: " + object.getFirstname() + " " + object.getLastname());
		System.out.println("User Name:" + object.getUsername());
	}
}