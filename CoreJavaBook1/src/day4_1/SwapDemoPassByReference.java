package day4_1;
//Swap Pass By Reference 
public class SwapDemoPassByReference 
{
 public static void swap(MyDate dt[])
 {
   MyDate temp;
   temp=dt[0];
   dt[0]=dt[1];
   dt[1]=temp;
 }	
 public static void main(String[] args) 
 {
  MyDate d[]= new MyDate[2];
  d[0]=new MyDate(1,1,2001);
  d[1]=new MyDate(2,2,2002);
  System.out.println("before swap");
  System.out.println("d[0]:"+d[0]);
  System.out.println("d[1]:"+d[1]);
  swap(d);
  System.out.println("after swap");
  System.out.println("d[0]:"+d[0]);
  System.out.println("d[1]:"+d[1]);
 }//end main
}//end class
