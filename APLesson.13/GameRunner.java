public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem xbx = new XBox("XBox");
		GameSystem ps = new PlayStation("PlayStation");
		GameSystem pco = new PC("PC");
		
		System.out.println(xbx + "\n");
		System.out.println(ps + "\n");
		System.out.println(pco + "\n");
	}
}