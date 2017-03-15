import java.util.*;
public class Toyota extends Car
{
	private double xcord, ycord;
	private int ID;
	public Toyota(String l)
	{
		ID = (int)(Math.random()*1000000)+999999;
		ArrayList<String> loc = new ArrayList<>(Arrays.asList(l.split(", ")));
		Double x = Double.parseDouble(loc.get(0));
		Double y = Double.parseDouble(loc.get(1));
		move(x, y);
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