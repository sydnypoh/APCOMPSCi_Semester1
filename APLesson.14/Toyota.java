import java.util.*;
public class Toyota implements Location
{
	private double xcord, ycord;
	private int ID;
	public Toyota(String l)
	{
		ArrayList<String> loc = new ArrayList<>(Arrays.asList(l.split(", ")));
		Double x = Double.parseDouble(loc.get(0));
		Double y = Double.parseDouble(loc.get(1));
		move(x, y);
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
		double[] location = {xcord, ycord};
		return location;
	 }
}