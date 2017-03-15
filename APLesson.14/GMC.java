public class GMC extends Car
{
	private double xcord, ycord;
	private int ID;
	
	public GMC()
	{
		xcord = 0;
		ycord = 0;
	}
	
	public GMC(double x, double y)
	{
		ID = (int)(Math.random()*1000000)+999999;
		xcord = x;
		ycord = y;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double x, double y)
	{
		xcord += x;
		ycord += y;
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = xcord;
		location[1] = ycord;
		return location;
	}
	
	
}