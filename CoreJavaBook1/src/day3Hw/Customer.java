package day3Hw;
/*
 Write a class Customer  and count no of customer objects and print no of customers before and after creating 3 objects of customer.
 */

public class Customer {
		int customerId;
		String custname;
		String city;
		static int count = 0;
		
		public Customer(int id, String n, String c) {
			customerId = id ;
			custname = n;
			city = c ;
			count++;
		}
		
		public static int displayCount() {
			return count;
		}
		
		public void print() {
			System.out.println();
			System.out.println("Customer Id: "+customerId);
			System.out.println("Customer Name: "+custname);
			System.out.println("Customer City: "+city);
			
		}
	public static void main(String[] args) {
		Customer c1 = new Customer(101,"Sarvesh","Amravati");
		c1.print();
		System.out.println("Count = "+Customer.displayCount());
		Customer c2 = new Customer(102,"Aditya","Pune");
		c2.print();
		System.out.println("Count = "+Customer.displayCount());
		Customer c3 = new Customer(103,"Yash","Kolhapur");
		c3.print();
		System.out.println("Count = "+Customer.displayCount());
	}

}

/*
 How to write a code to execute before main?
 => Write it Static Block ...
 */
