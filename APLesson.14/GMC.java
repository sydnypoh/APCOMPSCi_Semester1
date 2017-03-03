public class GMC implements Location
{
	private double xCord, yCord;
	private int ID;
	
	public GMC()
	{
		xCord = 0;
		yCord = 0;
	}
	
	public GMC(double x, double y)
	{
		xCord = x;
		yCord = y;
	}
	
	public void setID()
	{
		ID = (int)(Math.random()*1000000)+100000;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double xo, double yo)
	{
		xCord += xo;
		yCord += yo;
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = xCord;
		location[1] = yCord;
		return location;
	}
}