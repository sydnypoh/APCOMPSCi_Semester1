public abstract class Ticket
{
	private int serialno;
	
	public Ticket()
	{
		this.serialno = (int)(Math.random()*10000000)+1;
	}
	
	public int getserialno()
	{
		return serialno;
	}
	
	public abstract double getprice();
	
	public String toString()
	{
		return "Serial #: " + getserialno() + "\nPrice: $" + getprice(); 
	}
}