package pb4;

import java.util.Scanner;

public class Book {
	private String bookName;
	private int bookPrice;
	private String authorName;
	static int count;
	
	public Book() {
		count ++;
	}
	
	public Book(String bn, int bp, String a) {
		this();
		this.bookName = bn;
		this.bookPrice = bp;
		this.authorName = a;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public int getBookPrice() {
		return bookPrice;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	public void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Book Name   : ");
		bookName = sc.nextLine();
		System.out.print("\nEnter Book Price  : ");
		bookPrice = sc.nextInt();
		sc.nextLine();
		System.out.print("\nEnter Book Author : ");
		authorName = sc.nextLine();
	}
	public void display() {
		System.out.println("\n\nBook Name   = "+bookName);
		System.out.println("Book Price  = "+bookPrice);
		System.out.println("Author Name = "+authorName);
	}
}
