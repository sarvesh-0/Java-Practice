package BookManagement;
import java.util.Scanner;

public class BooksMain {

	public static void main(String[] args) {
		System.out.println("-----------------Welcome to the Book Store !------------------");
		Books b[] = new Books[20];
		int opt;
		do {
		System.out.println("Enter 1 to Accept Book Information ...........................");
		System.out.println("Enter 2 to Update Book Information ...........................");
		System.out.println("Enter 3 to Display all Book Details ..........................");
		System.out.println("Enter 4 to Display Book Details of a given Author ............");
		System.out.println("Enter 5 to Display Book Details by BookId ....................");
		System.out.println("Enter 6 to Exit ..............................................");
		System.out.println("Please Select the Option ....................................");
		Scanner sc = new Scanner(System.in);
		opt = sc.nextInt();
		System.out.println("--------------------------------------------------------------");
		
		switch (opt) {
		case 1:
			b[Books.count] = new Books();
			b[Books.count-1].acceptB();
			break;
		
		case 2:
            System.out.print("Enter the Book Id to update: ");
            int id = sc.nextInt();
            boolean err = true;
            for (Books book : b) {
                if (book != null && book.bookid == id) {
                    System.out.println("Updating details for Book ID: " + id);
                    book.updateBook();
                    err = false;
                    break;
                }
            }
            if (err == true) {
                System.out.println("Book with ID " + id + " not found.");
            }
            break;
			
		case 3:
			err = true;
			for(Books a:b) {
				if(a==null) {
					System.out.println("No more records ....");
					break;
				}
				else if(a!=null) {
					a.display();
				}
			}
			break;
			
		case 4:
			System.out.println("Enter Author Name: ");
			sc.nextLine();
			String auth = sc.nextLine();
			err = true;
			for(Books a:b) {
				
				if(a==null) {
					break;
				}
				
				else if(a.author.equalsIgnoreCase(auth)) {
					a.display();
					err = false;
				}
				
			}
			if(err == true) {
				System.out.println("Invalid Author Name .................");
			}
			break;
			
		case 5:
			System.out.println("Enter Author Name: ");
			int bi = sc.nextInt();
			err = true;
			for(Books a:b) {
				if(a==null) {
					break;
				}
				else if(a.bookid==bi) {
					a.display();
					err = false;
				}
			}
			if(err == true) {
				System.out.println("Invalid Book Id .................");
			}
			break;
			
		case 6:
			System.out.println("--------------------------------Thank You !----------------------------------");
			break;

		default:
			System.out.println("Select Valid Option !");
			break;
		}
		}while(opt!=6);
	}
}
