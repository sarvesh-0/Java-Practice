package pb3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Library {
	private ArrayList<Book> bookList = new ArrayList<>();
	
	public void addBook(Book bobj) {
		bookList.add(bobj);
		System.out.println("Book Added Sucessfully !");
		
	}
	
	public boolean isEmpty() {
		return bookList.isEmpty();
	}
	
	public ArrayList<Book> viewAllBooks(){
		return bookList;
	}
	
	public ArrayList<Book> viewAllBooksByAuthor(String author){
		ArrayList<Book> aut = new ArrayList<Book>();
		for(Book a : bookList) {
			if(author.equals(a.getAuthorName())) {
				aut.add(a);
			}
		}
		return aut;
	}
	
	int countBooks(String bn) {
		int count = 0;
		for(Book a : bookList) {
			if(bn.equals(a.getBookName())) {
				count ++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int opt;
		Scanner s = new Scanner(System.in);
		Library l = new Library();
		do {
			System.out.println("_______________________________________________________");
			System.out.println("Enter 1 to add Book");
			System.out.println("Enter 2 to Check if BookList is Empty ");
			System.out.println("Enter 3 to view all Books");
			System.out.println("Enter 4 to view Books by Author");
			System.out.println("Enter 5 to Count Books by Name");
			System.out.println("Enter 6 to Exit");
			System.out.println("_______________________________________________________");
			System.out.print("\nSelect the Option :");
			opt = s.nextInt();
			
			switch(opt) {
			
			case 1:
				System.out.println("_______________________________________________________");
				System.out.println("Enter Book Details :");
				System.out.print("\nBook Id     : ");
				int bno = s.nextInt();
				System.out.print("\nBook Name   : ");
				String bn = s.next().toUpperCase();
				System.out.print("\nAuther Name : ");
				String an = s.next().toUpperCase();
				Book b = new Book(bno,bn,an);
				l.addBook(b);
				System.out.println("_______________________________________________________");
				break;
				
			case 2:
				System.out.println("_______________________________________________________");
				if(l.isEmpty()) {
					System.out.println("Book List is Empty !");
				}
				else {
					System.out.println("Book List is Not Empty !");
				}
				System.out.println("_______________________________________________________");
				break;
				
			case 3:
				System.out.println("_______________________________________________________");
				ArrayList<Book> books = l.viewAllBooks();
				Iterator <Book> it = books.iterator();
				while(it.hasNext()) {
					Book b1 = it.next();
					b1.display();
				}
				System.out.println("_______________________________________________________");
				break;
				
			case 4:
				System.out.println("_______________________________________________________");
				System.out.println("Enter Author Name :");
				ArrayList<Book> ab = l.viewAllBooksByAuthor(s.next().toUpperCase());
				Iterator <Book> it1 = ab.iterator();
				while(it1.hasNext()) {
					Book b1 = it1.next();
					b1.display();
				}
				System.out.println("_______________________________________________________");
				break;
				
			case 5:
				System.out.println("_______________________________________________________");
				System.out.println("Enter Book Name :");
				System.out.println("_______________________________________________________");
				System.out.println("Book Count is "+l.countBooks(s.next().toUpperCase()));
				System.out.println("_______________________________________________________");
				break;
				
			case 6:
				System.out.println("_______________________________________________________");
				System.out.println("******************** Thank You ! **********************");
				break;
				
			default:
				System.out.println("-------------------------------------------------------");
				System.out.println("----------------   Invalid Input !   -------------------");
			}
			
		}while(opt!=6);
	}
}
