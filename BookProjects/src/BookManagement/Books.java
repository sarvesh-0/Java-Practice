/*
   Create a class Book containing Book_Id,Book_name, author and Price
   as a member fields and write properties and necessary member methods for the
   following 
   a. To Accept Book Information.
   b. Update book Information by Book_Id.  
   b. Display All book details.
   c. Display book details of a given author.
   d. Display book details of Book_Id.
Use Hints:
- Function Overloading
- Use Array of objects 
- Write Menu Driven Program.
*/
package BookManagement;

import java.util.Scanner;

public class Books {
	int bookid;
	String bookname;
	String author;
	float price;
	static int count;
	
	public Books(){
		count++;
	}
	
//	public Books(int bid, String n, String a, float p) {
//		this();
//		bookid = bid;
//		bookname = n;
//		author = a;
//		price = p;
//	}
	
	public void acceptB()
	{
		 Scanner sc= new Scanner(System.in);
		 System.out.print("Book Id :");
		 bookid = sc.nextInt();
		 System.out.print("\nBook Name:");
		 bookname =sc.nextLine();
		 sc.nextLine();
		 System.out.print("\nBook Author:");
		 author = sc.nextLine();
		 System.out.print("\nBook Price:");
		 price=sc.nextInt();
	 }
	
	public void display() {
		System.out.println("-----------------------------------------------------");
		System.out.println("Book ID : " + bookid);
        System.out.println("Book Name: " + bookname);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-----------------------------------------------------");
	}
	
    public void updateBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new Book Name: ");
        bookname = sc.nextLine();
        System.out.print("Enter new Author: ");
        author = sc.nextLine();
        System.out.print("Enter new Price: ");
        price = sc.nextFloat();
        System.out.println("Book Updated !");
    }
}
