/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightoLeft()
  {
	  Picture arch = new Picture("arch.jpg");
	  arch.explore();
	  arch.mirrorVerticalRightToLeft();
	  arch.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture redMotorcycle = new Picture("redMotorcycle.jpg");
	  redMotorcycle.explore();
	  redMotorcycle.mirrorHorizontal();
	  redMotorcycle.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture blueMotorcycle = new Picture("blueMotorcycle.jpg");
	  blueMotorcycle.explore();
	  blueMotorcycle.mirrorHorizontalBotToTop();
	  blueMotorcycle.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testMyCollage()
  {
	  Picture sheet = new Picture("640x480.jpg");
	  sheet.myCollage();
	  sheet.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
	swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture koala = new Picture("koala.jpg");
	  koala.keepOnlyBlue();
	  koala.explore();
  }
  
 public static void testNegate()
 {
	 Picture flower = new Picture("whiteFlower.jpg");
	 flower.negate();
	 flower.explore();
 }
 
 public static void testGrayscale()
 {
	 Picture gorge = new Picture("gorge.jpg");
	 gorge.grayscale();
	 gorge.explore();
 }
 
 public static void testMirrorArms()
 {
	 Picture snowman = new Picture("snowman.jpg");
	 snowman.explore();
	 snowman.mirrorArms();
	 snowman.explore();
 }
 
 public static void testMirrorGull()
 {
	 Picture gull = new Picture("seagull.jpg");
	 gull.explore();
	 gull.mirrorGull();
	 gull.explore();
 }
 
 public static void testCopy()
 {
	 Picture flower1 = new Picture("flower1.jpg");
	 flower1.copy(flower1,12,50);
	 flower1.explore();
 }
 
 public static void testNewCopy()
 {
	 Picture whiteFlower = new Picture("whiteFlower.jpg");
	 whiteFlower.explore();
	 whiteFlower.newCopy(whiteFlower,100,200,142,120,334,554);
	 whiteFlower.explore();
 }

  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMirrorVerticalRightoLeft();
    //testCollage();
    //testCopy();
	//testMyCollage();
	//testNewCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}