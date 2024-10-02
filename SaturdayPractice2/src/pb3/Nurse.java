package pb3;

public class Nurse extends Person{
	int hrsWorked;
	String shift;
	double hrsRate;
	
	public Nurse() {
		super();
	}
	
	public Nurse(String n , int hrwork, String sh, double hrrate) {
		super(n);
		this.hrsWorked = hrwork;
		this.shift = sh;
		this.hrsRate = hrrate;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Hours Worked   : "+hrsWorked);
		System.out.println("Shift          : "+shift);
		System.out.println("Hour Rate      : "+hrsRate);
	}
}
