import java.lang.Math.*;
public class Distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public Distance(int xO, int yO, int xT, int yT)
	{
		xOne = xO;
		yOne = yO;
		xTwo = xT;
		yTwo = yT;
		distance = 0;
	}
	
	public void setValues(int xO, int yO, int xT, int yT)
	{
		xOne = xO;
		yOne = yO;
		xTwo = xT;
		yTwo = yT;
	}
	
	public double getDist()
	{
		distance = Math.sqrt(((xTwo-xOne)*(xTwo-xOne))+((yTwo-yOne)*(yTwo-yOne)));
		return distance;
	}
}