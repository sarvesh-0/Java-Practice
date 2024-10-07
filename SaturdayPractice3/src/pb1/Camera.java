/*
Accept two numbers as input from the user using Scanner class's nextint() method. First input is total cost of the CCTV cameras (totalCost).
Second input is the number of the cameras purchased (no). Find the cost of each camera. (totalCost / no). If the input provided by the user is 
not a number (i.e.contains alphabets or special characters), it will result in InputMismatchException. Handle this exception and display 
appropriate message - "Input is not an integer" The second input should not be zero. if entered, will result in ArithmeticException. 
Handle this exception and display appropriate message - "Cannot divide by zero. Enter the number (non-zero) of cameras purchased"
Also handle any other exception occurred.
 */
package pb1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Camera {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalCost;
		int no;
		try {
			System.out.print("\nEnter Total Cost Of CCTV Cameras       : ");
			totalCost = sc.nextInt();
			System.out.print("\nEnter Number of CCTV Cameras Purchased : ");
			no = sc.nextInt();
			float cost = totalCost/no;
			System.out.println("Cost = "+cost);
		}catch(InputMismatchException e) {
			System.out.println("Input is not an Integer..");
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot Divide by Zero. Enter the (non-zero) Number of Cameras Purchsed ...");
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
}
