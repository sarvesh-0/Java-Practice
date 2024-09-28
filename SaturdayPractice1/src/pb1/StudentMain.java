package pb1;
import java.util.Scanner;
public class StudentMain {
	public static void main(String[] args) {
		String opt;
		String sid, sn, sa, c;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Enter Student ID :");
			sid = s.next();
			System.out.println("Enter Student Name :");
			sn = s.next();
			System.out.println("Enter Student Adress :");
			sa = s.next();
			System.out.println("Are you from ABC Institute ?");
			System.out.println("Enter Yes or No and Enter e to Exit");
			opt = s.next();
			
			switch(opt.toUpperCase()) {
			case "YES":
				Student s1 = new Student(sid,sn,sa);
				s1.display();
				break;
				
			case "NO":
				System.out.println("Enter College Name :");
				c = s.next();
				Student s2 = new Student(sid,sn,sa,c);
				s2.display();
				break;
				
			case "E":
				System.out.println("Thank You ;");
				break;
				
			default :
				System.out.println("Wrong Input !");
				break;
			}
		}while(!opt.equalsIgnoreCase("e"));
	}
}
