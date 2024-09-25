package day3Hw;
/*
 Write a class Employee with int empId, String name, float salary as attributes.
  Create 3 objects of employee and print details[Note: empId should be auto generated]
 */
public class Employee {
	static int count;
	int empId;
	String name;
	float salary;
	static {
		count = 0;
	}
	
	public Employee(String n, float s) {
		count = count + 1;
		empId = count;
		name = n;
		salary = s;
	}
	
	public void display() {
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Sarvesh",60000);
		Employee e2 = new Employee("Tejas",55000);
		Employee e3 = new Employee("Aditya",50000);
		e1.display();
		e2.display();
		e3.display();
	}

}
