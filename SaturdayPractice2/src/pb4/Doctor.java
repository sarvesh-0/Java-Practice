package pb4;

public class Doctor extends Person {
	double salary ;
	String specializationType;
	
	public Doctor(){
		super();
	}
	
	public Doctor(String n, double sal, String st) {
		super(n);
		this.salary = sal;
		this.specializationType = st;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Salary         : "+salary);
		System.out.println("Specialization : "+specializationType);
	}
}
