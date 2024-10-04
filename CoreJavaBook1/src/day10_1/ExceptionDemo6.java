package day10_1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class InvalidCharecterFoundException extends Exception{
	String msg;
	 public InvalidCharecterFoundException() 
	 {
		msg="InvalidCharecterFoundException.!!!";
	 }
	 public InvalidCharecterFoundException(String msg) 
	 {
		this.msg = msg;
	 }
	 @Override
	 public String toString() 
	 {
		return "InvalidCharecterFoundException"+msg;
	 }
	 @Override
	 public String getMessage()
	 {
		  return msg;
	 }
}

public class ExceptionDemo6 {
	 public static void main(String[] args) throws IOException 
	 {
	  FileInputStream fis= null;
	  try
	  {
	    fis= new FileInputStream("D:\\SEED\\Java Practice\\CoreJavaBook1\\src\\day10_1\\f1.txt");
	    int data=0;
	    while((data=fis.read())!=-1)
	    {
	    	if((char)data=='z')
	    		throw new InvalidCharecterFoundException("Testing...");
	      System.out.print(""+(char)data);	
	    }
	   
	  }
	  catch(FileNotFoundException e) 
	  {
		e.printStackTrace();
	  }//end catch
	  catch(InvalidCharecterFoundException e) {
		  e.printStackTrace();
	  }
	 }//end main
}
