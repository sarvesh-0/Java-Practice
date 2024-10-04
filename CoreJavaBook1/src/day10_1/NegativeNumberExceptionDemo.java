package day10_1;

import java.util.Scanner;

class NegativeNumberException1 extends Exception{
	String msg;
	public NegativeNumberException1() {
		this.msg = "Negative Number";
	}
	public NegativeNumberException1(String m) {
		this.msg = m;
	}
	@Override
	public String toString() {
		return "Negative Number Exception !!";
	}
	@Override
	public String getMessage() {
		return "Negative Number Exception !!" + msg;
	}
}
public class NegativeNumberExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		 try {
	            if (num < 0) {
	                throw new NegativeNumberException1();
	            } else {
	                int fact = 1;
	                for (int i = 1; i <= num; i++) {
	                    fact = fact * i;
	                }
	                System.out.println("Factorial is " + fact);
	            }
	        } catch (NegativeNumberException1 e) {
	            e.printStackTrace();
	        } finally {
	            sc.close();
	        }
	}
}
