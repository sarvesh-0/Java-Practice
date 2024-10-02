/*
There is a loan and insurance provider company named ABC. They want to automate the process of issuing loan and giving insurance
Create a class Vehicle with private data members --vehicleNo(int), modelName(String), vehicleType(String), price(double). 
Write four parameterized constructor. Vehicle type can be -"4 wheeler", "3wheeler" or "2 wheeler".
Create a public interface Loan with abstract method double issueloan()
Create a public interface Insurance with abstract method double takeinsurance()
Vehicle class should implement both interfaces.
Provide implementation of respective methods of the interfaces. 
issueloan() method:
Vehicle type - 4 wheeler, eligible loan amount is 75% of price
Vehicle type - 3 wheeler, eligible loan amount is 70% of price
Vehicle type 2 wheeler, eligible loan amount is 60% of price
takeinsurance() method:
Call the method Show()] from main() method
Vehicle price <= 150000, insurance amount is 4000
Vehicle price >= 150000 and <= 300000 insurance amount is 4500
Vehicle price > 300000, insurance amount is 6000.
Write a TestVehicle class to test the functionality.
 */
package pb5;

public class Vehicle implements Loan, Insurance{
	private int vehicleNo;
	private String modelName;
	private String vehicleType;
	private double price;
	
    public Vehicle(int vehicleNo, String modelName, String vehicleType, double price) {
        this.vehicleNo = vehicleNo;
        this.modelName = modelName;
        this.vehicleType = vehicleType;
        this.price = price;
    }
	
	@Override
	public double issueLoan() {
		switch (vehicleType.toLowerCase()) {
        case "4 wheeler":
            return 0.75 * price; 
        case "3 wheeler":
            return 0.70 * price; 
        case "2 wheeler":
            return 0.60 * price; 
        default:
            return 0;
		}
	}
	
	@Override
	public double takeInsurance() {
		if (price <= 150000) {
            return 4000;
        } else if (price > 150000 && price <= 300000) {
            return 4500;
        } else {
            return 6000;
        }
	}
	
	public void show() {
	        System.out.println("Vehicle No: " + vehicleNo);
	        System.out.println("Model Name: " + modelName);
	        System.out.println("Vehicle Type: " + vehicleType);
	        System.out.println("Vehicle Price: " + price);
	        System.out.println("Eligible Loan Amount: " + issueLoan());
	        System.out.println("Insurance Amount: " + takeInsurance());
	}
}
