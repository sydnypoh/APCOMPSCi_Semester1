public class Honda extends Car
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
		double[] location = new double[2];
		ID = (int)(Math.random()*1000000)+999999;
		xcord = l[0];
		ycord = l[1];
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