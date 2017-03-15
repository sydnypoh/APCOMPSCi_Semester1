public class GMC2 extends Car
{
	
	
	
	public GMC2(double x, double y)
	{
		super();
		ID = (int)(Math.random()*1000000)+999999;
		super.move(x, y);
	}
	
	
	
}