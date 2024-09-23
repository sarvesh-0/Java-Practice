package day1_extra;
/*
Write a Java Program to check weather the given number is Krishnamurthy or not.
Definition: A number is said to be Krishnamurthy if the factorial sum of all its digits is equal to that number. 
Krishnamurthy number is also referred to as a Strong number. Example  Number = 145  
= 1! + 4! + 5!  
= 1 + ( 4 * 3 * 2 * 1 ) + ( 5 * 4 * 3 * 2 * 1 )  
= 1 + 24 + 120  
= 145
*/
import java.util.Scanner;
public class Krishnamurthy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Num : ");
		int num = sc.nextInt();
		sc.close();
		int temp = num;
		int res = 0;
		while(temp!=0) {
			int n = temp % 10;
			temp = temp / 10;
			int fact = 1;
			for(int i=1; i<=n; i++) {
				fact = fact * i;
			}
			res = res + fact;
		}
		if(res==num) {
			System.out.println(num+" is Krishnamurthy !");
		}
		else {
			System.out.println(num+" is not Krishnamurthy !");
		}
		
	}	
}
