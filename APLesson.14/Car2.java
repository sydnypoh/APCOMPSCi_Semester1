public abstract class Car2 implements Location
{
	private final int ID = (int)(Math.random()*1000000)+999999;
	private double[] Location = new double[2];
	public Car2()
	{
		
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double x, double y)
	{
		Location[0] += x;
		Location[1] += y;
	}
	
	public double[] getLoc()
	{
		return Location;
	}
}