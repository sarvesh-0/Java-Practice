package pb3;
import java.util.Scanner;
public class TestMain {
	public static void main(String[] args) {
		String bn, an;
		int bp;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("\nEnter Book Name   : ");
		bn = s.nextLine();
		System.out.print("\nEnter Book Price  : ");
		bp = s.nextInt();
		s.nextLine();
		System.out.print("\nEnter Book Author : ");
		an = s.nextLine();
		
		Book b1 = new Book();
		b1.setBookName(bn);
		b1.setBookPrice(bp);
		b1.setAuthorName(an);
		
		System.out.println("\n\nBook Name   = "+b1.getBookName());
		System.out.println("Book Price  = "+b1.getBookPrice());
		System.out.println("Author Name = "+b1.getAuthorName());
	}
}
