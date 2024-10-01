package day7_2;

class SPCollege  implements Grade1
{
	
}
class FCCollege
{
	
}

public class MainTest 
{
 public static void main(String[] args) 
 {
     SPCollege ob1= new SPCollege();
     FCCollege ob2= new FCCollege();
     
     if(ob1 instanceof Grade1)
     {
    	 System.out.println("sp college is grade A ...");
     }
     if(ob2 instanceof Grade1)
     {
    	 System.out.println("fc college is grade A ...");
     }
 }
}
