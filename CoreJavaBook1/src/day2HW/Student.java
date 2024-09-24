package day2HW;

class Student1 {
	int rollNo;
	String name;
	double percentage;
	
	public void initStudent() {
		rollNo = 71;
		name = "Shrey";
		percentage=90.10;
	}
	
	public void printDetails() {
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollNo);
		System.out.println("Percentage: "+percentage);
	}
}

public class Student{
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.initStudent();
		s.printDetails();
	}
}



