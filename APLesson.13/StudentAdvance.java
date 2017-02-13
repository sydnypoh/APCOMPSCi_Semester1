public class StudentAdvance extends Advance
{
	public StudentAdvance()
	{
		super();
	}
	public StudentAdvance(int dl)
	{
		super(dl);
	}
	public double getprice()
	{
		return super.getprice() / 2;
	}
	
	public String toString()
	{
		return super.toString() + "\nSTUDENT ID REQUIRED";
	}
	
}