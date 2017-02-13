public class Advance extends Ticket
{
	public int daysleft;
	
	public Advance()
	{
		super();
	}
	public Advance(int dl)
	{
		daysleft = dl;
	}
	
	public double getprice()
	{
		if(daysleft > 9)
		{
			return 30.00;
		}
		else
		{
			return 40.00;
		}
	}
}