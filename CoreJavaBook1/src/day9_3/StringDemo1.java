package day9_3;

public class StringDemo1 
{
 public static void main(String[] args) 
 {
   String str1="Hello";
   String str2="Hello";
   String str3=new String("Hello");
   String str4="hello";
   
   //equals method ---> String class Method- Its check contents 
   System.out.println("str1 equals str2:"+str1.equals(str2)); // true
   System.out.println("str1 equals str3:"+str1.equals(str3)); //true
   System.out.println("str1 equals str4:"+str1.equals(str4)); //false
   
   //== operator ---> String - Its check memory location
   System.out.println("str1 == str2:"+(str1==str2)); // true
   System.out.println("str1 == str3:"+(str1==str3)); //false
   System.out.println("str1 == str4:"+(str1==str4)); //false
   
   //hashcode ---> String class Method
   System.out.println("str1 hashcode:"+str1.hashCode());
   System.out.println("str2 hashcode:"+str2.hashCode()); 
   System.out.println("str3 hashcode:"+str3.hashCode()); 
   System.out.println("str4 hashcode:"+str4.hashCode()); 
   
 }//end main
} //end class
