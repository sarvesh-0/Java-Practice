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
public class BusTicket {
	private int ticketNo;
	private float ticketPrice;
	private float totalAmount;
	private Person per;
	
	public int getTicketNo() {
		return ticketNo;
	}
	
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	
	public float getTicketPrice() {
		return ticketPrice;
	}
	
	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public float getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public Person getPer() {
		return per;
	}
	
	public void setPer(Person per) {
		this.per = per;
	}
	
	
}
