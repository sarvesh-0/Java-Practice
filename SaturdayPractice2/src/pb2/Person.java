/*
Create a class Person with attributes - name (String) with default access specifier. This class should be non-instantiable.
It should contain a method named "displayDetails()" which displays the name. Create a Doctor class which should be of type 
Person(is-a relationship). It should contain salary (double). specialzationType (String) with default access specifier. 
It should contain a method named "displayDetails()" that displays the salary and specialization of the doctor.
Both classes should contain parameterized constructors. Create a TestMain class with main() method to test the functionality by 
creating object of Doctor class.
 */

package pb2;
public abstract class Person {
	String name;
	
	public Person() {

	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void displayDetails(){
		System.out.println("Name : "+name);
	}
}
