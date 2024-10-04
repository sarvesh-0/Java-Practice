package day10_1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ExceptionDemo6 {
	 public static void main(String[] args) throws IOException 
	 {
	  FileInputStream fis= null;
	  try
	  {
	    fis= new FileInputStream("D:\\JavaPrograms\\CoreJavaDemos\\CoreJavaBook2\\src\\day10_1\\f1.txt");
	    int data=0;
	    while((data=fis.read())!=-1)
	    {
	    	if((char)data=='z')
	    		throw new SecurityException("Testing...");
	      System.out.print(""+(char)data);	
	    }
	   
	  }
	  catch(FileNotFoundException e) 
	  {
		e.printStackTrace();
	  }//end catch
	 }//end main
}
