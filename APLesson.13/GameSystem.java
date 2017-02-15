public abstract class GameSystem
{
	private String platform;
	private int serialNo;
	
	public GameSystem()
	{
		platform = "";
		serialNo = 0;
	}
	
	public GameSystem(String p)
	{
		platform = p;
		serialNo = (int)(Math.random()*10000000)+1;
	}
	
	public String getplatform()
	{
		return platform;
	}
	
	public int getserialNo()
	{
		return serialNo;
	}
}