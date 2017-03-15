public class Honda2 extends Car
{
	
	
	public Honda2(double[] l)
	{
		super();
		double[] location = new double[2];
		ID = (int)(Math.random()*1000000)+999999;
		super.move(l[0], l[1]);
	}
	
	

}