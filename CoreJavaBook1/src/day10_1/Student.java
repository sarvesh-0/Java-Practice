package day10_1;

import java.util.*;
class NameException extends Exception{
	String msg;
	
	public NameException(){
		this.msg = "NameException";
	}
	
	public String toString() {
		return msg;
	}
	
	public String getMessage() {
		return msg;
	}
}

class AgeException extends Exception{
	String msg;
	
	public AgeException(){
		this.msg = "AgeException";
	}
	
	public String toString() {
		return msg;
	}
	
	public String getMessage() {
		return msg;
	}
}

public class Student {
	int sId;
	String sName;
	int age;
	
	public Student() {
		this.sId = 101;
		this.sName = "Sarvesh";
		this.age = 22;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Student Id   : ");
		this.sId = sc.nextInt();
		System.out.print("\nEnter Student Name : ");
		this.sName = sc.next().trim();
		System.out.print("\nEnter Student Age  : ");
		this.age = sc.nextInt();
	}
	
	public void displayData() {
		System.out.println("Student Id   : "+sId);
		System.out.println("Student Name : "+sName);
		System.out.println("Student Age  : "+age);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.acceptData();
		try {
			if(!s.sName.matches("[a-zA-Z]")) {
				throw new NameException();
			}
		}catch(NameException e){
			e.printStackTrace();
		}
		try {
			if(s.age < 18) {
				throw new AgeException();
			}
		}catch(AgeException e) {
			e.printStackTrace();
		}
		s.displayData();
	}
}
