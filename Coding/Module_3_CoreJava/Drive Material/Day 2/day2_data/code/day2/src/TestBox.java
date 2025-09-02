import java.util.Scanner;
class TestBox
{
  public static void main(String[] args) {
  //create scanner class instance to wrap console i/public
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Box dimensions - w d h");
  int data=100;
  Box b1;//b1 -> class type of reference : local var.
  //System.out.println(b1);javac err : un initialzed var.
  b1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
  System.out.println(b1);
  //display box dims
  System.out.println(b1.getBoxDimensions());
  //display box volume
  System.out.println("Volume : "+b1.getVolume());
  Box b2=new Box(10,20,30);
  System.out.println("Volume : "+b2.getBoxDimensions());
  System.out.println(b2);
  Box b3=b1;
  System.out.println(b3);
   System.out.println(b3.getBoxDimensions());
   b1=null;
  // System.out.println(b1.getBoxDimensions());//java.lang.NullPointerException
   b3=null;
   //what will happen in memory diagram ? b3 : de referenced
  // System.out.println(b3.getBoxDimensions());
   System.out.println("closing scanner ....");
  
  sc.close();
  }
}