public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket wu = new Walkup();
		Ticket adv = new Advance(10);
		Ticket sadv = new StudentAdvance(6);
		
		System.out.println(wu);
		System.out.println(adv);
		System.out.println(sadv);
	}
}