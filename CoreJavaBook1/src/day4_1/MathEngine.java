package day4_1;

public class MathEngine 
{
  public void add(int...a)
  {
	  int sum=0;
	  for(int x:a)
	  {
		  sum=sum+x;
	  }
	  System.out.println("Addition is:"+sum);
  }

 public static void main(String[] args) 
 {
	 MathEngine ob =new MathEngine();
	 ob.add(1,2);
	 ob.add(1,2,3);
	 ob.add(1,2,3,4);

 }//end main
}//end class
