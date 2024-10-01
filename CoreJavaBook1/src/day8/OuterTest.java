package day8;

class OutClass
{
    int a; //Instance field
    static int count=10; // static field 
    public void dispaly()  //Instance Method
    {
     System.out.println("Value of a:"+a); 
    }
    public static void displayCount() // static method
    {
     System.out.println("Value of Count:"+count);
    }
    static class InClass
    {
	  int b;
	  static int cnt;
	  public void dispaly()  //Instance Method
	  {
		 //System.out.println("Value of a:"+a); 
		 System.out.println("value of b:"+b);
	  } 
	  public static void displayCnt() // static method
	  {
		 displayCount(); 
		 System.out.println("Value of Cnt:"+cnt);
	  } 
	 
   }	
}
public class OuterTest 
{
 public static void main(String[] args) 
 {
    OutClass outref= new OutClass();
    outref.dispaly();
    OutClass.displayCount();
    
    OutClass.InClass inref= new OutClass.InClass();
    inref.dispaly();
    OutClass.InClass.displayCnt();
 }//end main
}//end class
