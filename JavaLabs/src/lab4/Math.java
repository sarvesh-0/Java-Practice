package lab4;

/*
 * Write a method in the MathClass that accepts variable number of integers. The method should find the sum of all the
 *  integers passed and display the result. Write a client program to call the method with variable number of integers.
 */

class Math
{
  public void add(int...a) {// varArg method
	 int sum=0; 
	 for(int x:a)
	 {
	   sum=sum+x;
    }
	 System.out.println("Addition is:"+sum);
  }
  
  public static void main(String[] args) {
    Math ob1= new Math();
    ob1.add(2,3);
    ob1.add(2,3,4);
    ob1.add(2,3,4,5);
    ob1.add(2,3,4,5,5,6,7,8);
  } 
}
