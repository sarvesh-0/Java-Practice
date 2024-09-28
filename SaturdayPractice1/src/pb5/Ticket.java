package pb5;
/*
 * 5) Create a class Ticket with private data members-ticketid (int), price (int), available 
 * Tickets(static int). Include getters and setters in the Ticket class. available Tickets should
 *  only contain positive values. Zero and negative values are not allowed (Perform this validation 
 *  in the appropriate setter method.
 *	Write the following method in Ticket class: public int calculateTotal Cost(int noOfTickets),
 *	This method should if the tickets are available. If the tickets are available, update the
 *	value of availableTickets and calculate the total cost of the tickets (price" noofTickets) and
 *	return the total amount from the method. If the tickets are unavailable, return -1
 *	Implement main() method in a separate class TestMain to test the functionality.
 */
public class Ticket {
	private int ticketid;
	private int price;
	private static int availableTickets;
	static {
		availableTickets = 50;
	}
	public Ticket() {
		this.price = 200;
		if(availableTickets<1) {
			System.out.println("Error No Tickets Available !");
		}
		else {
			availableTickets --;
		}	
	}
	
	public int  calculateTotalCost(int noOfTickets) {
		if(availableTickets+1 >= noOfTickets) {
		availableTickets = (availableTickets+1)  - noOfTickets;
		return price * noOfTickets;
		}
		else {
			return -1;
		}
	}
}
