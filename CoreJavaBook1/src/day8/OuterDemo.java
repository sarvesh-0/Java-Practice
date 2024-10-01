package day8;

class Outer
{
   int a; //Instance field
   static int count=10; // static field 
   public void dispaly()  //Instance Method
   {
	  System.out.println("Value of a:"+a); 
   }
   public static void displayCnt() // static method
   {
	   System.out.println("Value of Count:"+count);
   }
  class Inner
   {
	  int b;  //Instance field
	  public void displayB()
	  {
	   System.out.println("Value of a:"+a);
	   System.out.println("Value of a:"+b);
	   System.out.println("Value of count:"+count);
	  }
   }//end class
  
}
public class OuterDemo
{
 public static void main(String[] args) 
 {
    Outer outob= new Outer();
    outob.dispaly();
    Outer.displayCnt();
    
    Outer.Inner inobj=outob.new Inner();
	inobj.displayB(); 
 }//end main	
}//end class
