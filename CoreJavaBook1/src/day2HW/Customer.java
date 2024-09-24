package day2HW;

public class Customer {
	int customerId;
	String custname;
	String city;
	public Customer() {
		customerId = 100 ;
		custname = "Sarvesh";
		city = "Amravati" ;
	}
	
	public Customer(int id, String n, String c) {
		customerId = id ;
		custname = n;
		city = c ;
	}
	
	private void print() {
		System.out.println("Customer Id: "+customerId);
		System.out.println("Customer Name: "+custname);
		System.out.println("Customer City: "+city);
	}
	
	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer(102,"Luffy","Pune");
		c1.print();
		c2.print();
	}
}
