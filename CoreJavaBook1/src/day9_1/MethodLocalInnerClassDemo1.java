package day9_1;

class Outer1
{
   int n;
   static int cnt=10;
   Outer1()
   {
	n=10;   
   }
   static public void displayCnt()
   {
	   System.out.println("value of cnt:"+cnt);
   }
   // jdk8
   public void m1()
   {
	 int z=100;  // Local Variable   -- effective final variable  
     class Inner1       // Method local Inner class
     {
        int a;
        Inner1()
        {
         a=20;	
        }
	    public void display()
	    {
	    	System.out.println("value of a:"+a);
	    	System.out.println("value of z:"+z);
	    }
        
     } //end class
     //z=20;
	 Inner1 ob = new Inner1();
	 ob.display();
	   
   }//end method
}




public class MethodLocalInnerClassDemo1 
{
 public static void main(String[] args) 
 {
    Outer1 ob= new Outer1();
    ob.m1();

 }//end main
}//end class
