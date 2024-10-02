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
package pb6;

public class Person {
	private String name;
	private char gender;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
