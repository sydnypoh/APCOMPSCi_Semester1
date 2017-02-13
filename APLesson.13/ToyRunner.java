import java.util.Scanner;
public class ToyRunner
{
	
	public static void main (String[]args)
	{	
		String toy = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
		toystore store = new toystore(toy);
		System.out.println(store);
		System.out.println(store.getMostFrequentToy());
		System.out.println(store.getMostFrequentType());
	}
}