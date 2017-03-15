public abstract class Car implements Location
{
	private final int ID = (int)(Math.random()*1000000)+999999;
	private double[] Location = new double[2];
	public Car()
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