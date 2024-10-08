package pb3;

public class Book {
	private int isbnno;
	private String bookName;
	private String authorName;
	public static int count;
	
	public Book() {
		count ++;
	}
	
	public Book(int isbnno, String bookName, String authorName) {
		this();
		this.isbnno = isbnno;
		this.bookName = bookName;
		this.authorName = authorName;
	}

	public int getIsbnno() {
		return isbnno;
	}
	
	public void setIsbnno(int isbnno) {
		this.isbnno = isbnno;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public void display() {
		System.out.println("Book Id     : "+this.isbnno);
		System.out.println("Book Name   : "+this.bookName);
		System.out.println("Author Name : "+this.authorName);
	}
	
}
