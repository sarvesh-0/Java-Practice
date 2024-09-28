package pb6;
import java.util.Scanner;
public class TestStudent {
	public static Student getStudentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();
    
        while (numSubjects <= 0) {
            System.out.println("Invalid number of subjects. Please enter again: ");
            numSubjects = sc.nextInt();
        }
        int[] marks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            int mark = sc.nextInt();

            while (mark < 0 || mark > 100) {
                System.out.println("Invalid marks. Please enter marks between 0 and 100: ");
                mark = sc.nextInt();
            }
            marks[i] = mark;
        }
        return new Student(id, name, marks);
    }
	public static void main(String[] args) {
		Student s = getStudentDetails();
		s.calculateAverage();
		s.findGrade();
		
        System.out.println("\nStudent Details:");
        System.out.println("ID: " + s.getSid());
        System.out.println("Name: " + s.getSname());
        System.out.println("Average: " +s.getAvg());
        System.out.println("Grade: "+s.getGrade());
	}
}
