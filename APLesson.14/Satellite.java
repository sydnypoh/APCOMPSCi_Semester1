import java.util.ArrayList;
public class Satellite
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));


       double[] home = {0, 0};


       System.out.println("\n\n" + "==========================" + "\nStarting locations...\n");
       for (Location l : locate)
       {
           System.out.println("Location for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")");
       }

	   System.out.println("\n\n" + "==========================");
	   for (Location l: locate)
	   {
		   double x, y;
		   x = (Math.random()*100)+1;
		   y = (Math.random()*100)+1;
		   System.out.printf("After %6d moved (%4.2f, %4.2f)\n", l.getID(), x ,y);
		   l.move(x,y);
		   System.out.println("New Location: (" + getLocation(l.getLoc()) + ")\n");
	   }
	   
       System.out.println("\n" + "==========================" + "\nDistance from home...\n");
       for (Location l : locate)
       {
           System.out.printf("Distance for %6d: (%4.2f)\n", l.getID(), getDistance(l.getLoc(), home));
       }

   }


   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return String.format("%4.2f, %4.2f", loc[0], loc[1]);
   }
}