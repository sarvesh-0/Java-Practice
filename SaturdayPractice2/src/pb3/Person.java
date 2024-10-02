/*
Inherit another class ""Nurse" from the Person class created in above problem statement. Inciude hrsWorked (int), shift(String), 
hrRate(Double) with default access specifier in the class. Implement the "'displayDetails()" method in Nurse ciass. Implement parameterized 
constructor in the class. Modify the TestMain class created in the above problem statement. Add a static method named "Show()". This method 
should take a base class reference as a parameter and invoke displayDetails () method of a cass depending on the reference of the object passed.
Call the method Show() from main() method.
 */

package pb3;
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
