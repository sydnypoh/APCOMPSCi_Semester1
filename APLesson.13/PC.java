public class PC extends GameSystem
{
	public PC()
	{
		super();
	}
	
	public PC(String p)
	{
		super(p);
	}
	
	public String systeminput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: " + super.getplatform() + "\nSerial #: " + super.getserialNo() + "\nController: " + systeminput();
	}
}