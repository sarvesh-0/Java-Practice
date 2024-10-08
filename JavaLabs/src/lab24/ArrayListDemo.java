package lab24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Comparator;

class Student implements Comparable <Student>{
	int id;
	private String name;
	private float persentage;
	
	public Student() {
		
	}
	
	public Student(int id, String name, float p) {
		this.id = id;
		this.name = name;
		this.persentage = p;
	}
	
	public Student getStudent(int id, String name, float p) {
		Student s = new Student(id,name,p);
		return s;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getPersentage() {
		return persentage;
	}

	public void setPersentage(float persentage) {
		this.persentage = persentage;
	}

	public void display() {
		System.out.println();
		System.out.println("Student Id         : "+this.id);
		System.out.println("Student Name       : "+this.name);
		System.out.println("Student Percentage : "+this.persentage);
	}
	
	public int compareTo(Student s) {
		if(this.id > s.id)
			return 1;
		if(this.id < s.id)
			return -1;
		return 0;
	}
	
}

class StudentNameComparator implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2) {
		String name1 = s1.getName();
		String name2 = s2.getName();
		return name1.compareTo(name2);
	}
}

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<>();
		
		int opt;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("Enter 1 to Add Student    ");
			System.out.println("Enter 2 to Update Student ");
			System.out.println("Enter 3 to Search Student ");
			System.out.println("Enter 4 to Delete Student ");
			System.out.println("Enter 5 to Display All Student    ");
			System.out.println("Enter 6 to Display Student in Acending Order Of ID ");
			System.out.println("Enter 6 to Display Student in Acending Order Of Name ");
			System.out.println("Enter 8 to Exit           ");
			System.out.print("\nPlease Select the Option  ");
			opt = sc.nextInt();
			
			switch(opt) {
				case 1 :
					System.out.print("\nEnter Student Id     :");
					int id = sc.nextInt();
					System.out.print("\nEnter Student Name   :");
					String name = sc.next();
					System.out.print("\nEnter Percentage     :");
					int no = sc.nextInt();
					Student st = new Student();
					
					arr.add(st.getStudent(id, name, no));
					
					break;
					
				case 2 :
					System.out.println("Enter Student Id   : ");
					int sid = sc.nextInt();
					for(Student s : arr) {
						int a = s.getId();
						if(a == sid) {
							System.out.print("\nEnter Student Name   :");
							s.setName(sc.next());
							System.out.print("\nEnter Percentage     :");
							s.setPersentage(sc.nextInt());
							System.out.println("Student Details Updated !");
						}
					}
					break;
					
				case 3 :
					System.out.println("Enter Student Id   : ");
					int u = sc.nextInt();
					for(Student s : arr) {
						int a = s.getId();
						if(a == u) {
							s.display();
						}
					}
					break;
					
				case 4 :
					System.out.println("Enter Student Id   : ");
					u = sc.nextInt();
					for(Student s : arr) {
						int a = s.getId();
						if(a == u) {
							arr.remove(s);
							System.out.println("Student Removed !");
						}
					}
					break;
					
				case 5:
					System.out.println();
					System.out.println("Students Details");
					for(Student s : arr) {
						s.display();
					}
					System.out.println();
					break;
					
				case 6:
					System.out.println();
					System.out.println("Students Details");
					Collections.sort(arr);
					
					for(Student s : arr) {
						s.display();
					}
					System.out.println();
					break;
					
				case 7:
					System.out.println();
					System.out.println("Students Details");
					Collections.sort(arr,new StudentNameComparator());
					for(Student s : arr) {
						s.display();
					}
					System.out.println();
					break;
					
				case 8 :
					System.out.println("Thank You !");
					break;
					
				default :
					System.out.println("Please Select the Correct Option from above .....");
					break;
			}
			
		}while(opt!=8);

	}
}
