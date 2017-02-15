public abstract class Console extends GameSystem
{
	public Console()
	{
		super();
	}
	
	public Console(String p)
	{
		super(p);
	}	
	
	public abstract String getcontroller();
	
	public String toString()
	{
		return "Platform: " + super.getplatform() + "\nSerial #: " + super.getserialNo() + "\nController: " + getcontroller();
	}
}