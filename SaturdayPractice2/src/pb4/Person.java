/*
Modify the Nurse class created in above problem statement as mentioned below: Add a specific method in the class "'calculatePayment()" 
to calculate the payment of a nurse based on hours worked and the hourly rate. Invoke this method from Show() method implemented in TestMain 
class. Check if it can be implemented using base class reference. What should be implemented?
 */

package pb4;
public abstract class Person {
	String name;
	
	public Person() {

	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void displayDetails(){
		System.out.println("Name           : "+name);
	}
}
