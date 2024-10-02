package pb6;

public class BusTicket {
	private int ticketNo;
	private float ticketPrice;
	private float totalAmount;
	private Person person;
	
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
	
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	void calculateTotal() {
		float dis = 0;
		int age = this.person.getAge();
		System.out.println(age);
		char gen = person.getGender();
		
		if (age < 16) {
            dis = 0.50f;
        } else if (age >= 60) {
            dis = 0.25f; 
        } else if (gen == 'F' || gen == 'f') {
            dis = 0.10f;
        }
		
		totalAmount = totalAmount - (ticketPrice * dis);
	}
	
}
