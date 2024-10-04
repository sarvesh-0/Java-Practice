package day10_1;

import java.util.Scanner;

class SmallNumberException extends Exception{
	String msg;
	public SmallNumberException() {
		this.msg = "SmallNumberException..";
	}
	
	public String toString() {
		return msg;
	}
	
	public String getMessage() {
		return msg;
	}
}

class ProperNumberException extends Exception{
	String msg;
	public ProperNumberException() {
		this.msg = "ProperNumberException..";
	}
	
	public String toString() {
		return msg;
	}
	
	public String getMessage() {
		return msg;
	}
}

class GreaterNumberException extends Exception{
	String msg;
	public GreaterNumberException() {
		this.msg = "GreaterNumberException..";
	}
	
	public String toString() {
		return msg;
	}
	
	public String getMessage() {
		return msg;
	}
}

public class ExceptionHandleingDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter The Number : ");
		int num = sc.nextInt();
		try {
		if(num>=0 && num<=10) {
			throw new SmallNumberException();
		}
		else if(num>=11 && num<=15) {
			throw new ProperNumberException();
		}
		else if(num>=16 && num<=20) {
			throw new GreaterNumberException();
		}
		}catch(SmallNumberException e) {
			e.printStackTrace();
		}catch(ProperNumberException e) {
			e.printStackTrace();
		}catch(GreaterNumberException e) {
			e.printStackTrace();
		}
	}
}
