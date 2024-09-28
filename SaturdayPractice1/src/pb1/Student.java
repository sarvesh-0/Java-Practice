package pb1;
import java.util.Scanner;
public class Student {
	private String studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;
	
	public Student(){
		this.studentId = "1001";
		this.studentName = "Sarvesh";
		this.studentAddress ="abcd";
		this.collegeName ="xyz";
	}
	
	public Student(String sid, String sname, String sads) {
		this.studentId = sid;
		this.studentName = sname;
		this.studentAddress = sads;
		this.collegeName = "ABC Technical Institute";
	}
	
	public Student(String sid, String sname, String sads, String col) {
		this.studentId = sid;
		this.studentName = sname;
		this.studentAddress = sads;
		this.collegeName = col;
	}
	
	public void display() {
		System.out.println();
		System.out.println("Student Id: "+studentId);
		System.out.println("Student Name: "+studentName);
		System.out.println("Student Address: "+studentAddress);
		System.out.println("College Name: "+collegeName);
	}
}
