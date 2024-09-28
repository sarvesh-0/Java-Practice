package pb6;
/*
Create an appication to calculate the grade of a student. Create a class "Student" with private data members - id (int), name(String),
marks[integer array),average(float), grade (char). Write appropriate getters and setters in the dass. Write a constructor with 3 arguments
Implement the following methods in the dass: 
void calculateAverage(); - This method should calculate the average of marks and assign it to the current student.
void findGrade(); -This method should set the grade based on the calculated average based on the following:
If the average is between 80 and 100, then set grade as `0.
If the average is between 70 and 80, then set grade as 'A'.
If the average is between 50 and 70, then set grade as 'B'.
If the average is less than S0, then set grade as 'F".
Note that the number of subjects should be greater than 0 If not, display ""Invalid no of subjects" and get the number again. 
Assume the marks entered should be in the range of 0- 100. If not, print " Invalid marks" and get the marks again.
Write a TestStduent class with main|) method. In the same class, implement amethod - 
public static Student getStudentDetails(). This method should get the input from the user and create a student object with appropriate constructor.
Return the object from the method in main() method, create a student object by invoking getStudentDetails() method.
Calculate the average and grade of the student and display the data using getter methods.
Take care that the while taking input from the user, give user friendly interface.
 */
public class Student {
	private int sid;
	private String sname;
	private float avg;
	private char grade;
	private int marks[];
	
	public Student() {
		
	}
	
	public Student(int id, String n, int[] m) {
		this.sid = id;
		this.sname = n;
		this.marks = m;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public int getSid() {
		return sid;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public int[] getMarks() {
		return marks;
	}
	
	public void calculateAverage() {
		int sum = 0;
		for(int m:marks) {
			sum = sum + m;
		}
		this.avg = sum/(float)marks.length;
	}
	
	public float getAvg() {
		return avg;
	}
	
	public char getGrade() {
		return grade;
	}
	
    public void findGrade() {
        if (avg >= 80 && avg <= 100) {
            this.grade = 'O';
        } else if (avg >= 70 && avg < 80) {
            this.grade = 'A';
        } else if (avg >= 50 && avg < 70) {
            this.grade = 'B';
        } else if (avg < 50) {
            this.grade = 'F';
        }
    }
}
