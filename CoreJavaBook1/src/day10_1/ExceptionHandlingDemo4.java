package day10_1;

import java.util.Scanner;

class NegativeNumberException extends Exception{
	String msg;
	public NegativeNumberException() {
		this.msg = "Negative Number";
	}
	public NegativeNumberException(String m) {
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

public class ExceptionHandlingDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		 try {
	            if (num < 0) {
	                throw new NegativeNumberException();
	            } else {
	                System.out.println("Number "+num+" is Positive");
	            }
	        } catch (NegativeNumberException e) {
	            e.printStackTrace();
	        } finally {
	            sc.close();
	        }
	}
}
