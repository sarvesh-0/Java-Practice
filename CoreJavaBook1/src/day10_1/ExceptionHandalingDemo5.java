package day10_1;
import java.util.Scanner;
public class ExceptionHandalingDemo5 {
	public static void main(String[] args) 
	 {
	   Scanner sc = new Scanner(System.in);
	   int cnt=0;
	   try
	   {
		while(true)
		{
	    System.out.println("Enter the username:");
	    String uname=sc.next();
	    System.out.println("Enter the password:");
	    String upwd=sc.next();
	    if(uname.equals("admin") && upwd.equals("admin123"))
	    {
		   System.out.println("Login Successfully...");
		   break;
	    }
	    else
	    {
		   cnt++;
		   
		   if(cnt>2)
		   {
			   throw new SecurityException("username or password denied..!: Testing...");
		   }
		   System.out.println("username or password denied..! try again ...:"+cnt);
		   continue;
	    }
		}
	   } 
	   catch (SecurityException e) 
	   {
		 e.printStackTrace();
		 System.out.println("conatct to manager...");
	   } 
	 }
}
