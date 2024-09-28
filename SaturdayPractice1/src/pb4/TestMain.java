package pb4;
import java.util.Scanner;
public class TestMain {
	public static void main(String[] args) {
		String bn, an;
		int bp,n;
		
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter Total Number of Books  : ");
		n = s.nextInt();
		Book b[] = new Book[n];
		for(int i=0; i<n; i++) {
			b[Book.count] = new Book();
			b[Book.count-1].setData();
		}
		for(int i=0; i<n; i++) {
			b[i].display();
		}
	}
}
