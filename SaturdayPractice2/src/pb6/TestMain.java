package pb6;
/*
Create a class named "Person: with private data members - name (String), gender(char)
and age(int). Include appropriate getters and setters
Create a class "BusTicket" with private members - ticketNo(int), ticketPrice(fioat),
totalAmount(float), per (Person). Indude appropriate getters and setters
Implement following method in BusTicket class
void calculateTotal() - This method should calculate the total price and set it based on
the discount given below:
1. Children with age <16 - 50% discount
2. Senior citizen with age >= 60- 25% discount
3. Ladies -10% discount
4. No discount for remaining category
Create a TestMain class with main() method to perform input and output:
For input, method should be:
Public static BusTicket getTicketDetails( ) - Get the relevant details about the BusTicket in
the method and retumn BusTicket object. Call this method in main(). Using the returned
object from this method call the calculate Total) method. Print the output
*/
import java.util.Scanner;
public class TestMain {
	 public static BusTicket getTicketDetails() {
	        Scanner sc = new Scanner(System.in);

	        BusTicket ticket = new BusTicket();

	        System.out.print("Enter Ticket Number: ");
	        ticket.setTicketNo(sc.nextInt());

	        System.out.print("Enter Ticket Price: ");
	        ticket.setTicketPrice(sc.nextFloat());

	        Person person = new Person();

	        System.out.print("Enter Person's Name: ");
	        sc.nextLine(); 
	        person.setName(sc.nextLine());

	        System.out.print("Enter Gender (M/F): ");
	        person.setGender(sc.next().charAt(0));

	        System.out.print("Enter Age: ");
	        person.setAge(sc.nextInt());

	        ticket.setPerson(person);

	        return ticket;
	    }
	
	public static void main(String[] args) {
		BusTicket t = getTicketDetails();
		t.calculateTotal();
        System.out.println("Ticket No: " + t.getTicketNo());
        System.out.println("Person Name: " + t.getPerson().getName());
        System.out.println("Ticket Price: " + t.getTicketPrice());
        System.out.println("Total Amount: " + t.getTotalAmount());

	}
}
