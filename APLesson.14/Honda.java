public class Honda implements Location
{
	private double xcord, ycord;
	private int ID;
	public Honda()
	{
		xcord = 0;
		ycord = 0;
	}
	
	public Honda(double[] l)
	{
		xcord = l[0];
		ycord = l[1];
	}
	
	public void setID()
	{
		ID = (int)(Math.random()*1000000)+100000;
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