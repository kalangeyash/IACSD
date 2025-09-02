class TestPrimitiveConversions {
 public static void main(String[] args)
 {
  byte b1=127;
  //byte b2=128;//javac err
  byte b2=10;
  byte b3=14;
  byte b4=(byte)(b2+b3);
  b3 += 20;//b3=(byte)(b3+20);
  short s1=1234;
  //short s2=b1+s1;javac err
  long l1=12345678;
  float f1=l1;
  f1=1234.56f;//no javac err
  double d1=f1;
  d1=s1;
  char ch=65;
  int i=ch;
  //signed right shift vs un signed right shit operator
  int a=30;
  int b=-30;
  System.out.println("Signed right shift of 30 : "+(a>>1));
  System.out.println("Signed right shift of -30 : "+(b>>1));
   System.out.println("UnSigned right shift of 30 : "+(a>>>1));
  System.out.println("UnSigned right shift of -30 : "+(b>>>1));

 
 }
}