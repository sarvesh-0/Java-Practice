package lab7;
/*
Implement toString() method of Employee class to represent the string representation of employee object.
The method should return employee id, employee name and gross salary as a string.
 */
public class Employee {
	private int empId;
	private String empName;
	private double bSal;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double netSal;
	private double gSal;
	private static int count ;
	static {
		count = 0;
	}
	
	public Employee() {
		 this.empId = 0;
	     this.empName = "";
	        this.bSal = 0.0;
	        this.hra = 0.0;
	        this.medical = 0.0;
	        this.pf = 0.0;
	        this.pt = 200.0;
	        this.gSal = 0.0;
	        this.netSal = 0.0;
	        count ++ ;
	}
	
	public Employee(int empId , String empName, double bSal, double medical) {
		this();
		this.empId = empId;
		this.empName = empName;
		this.bSal = bSal;
		this.medical = medical;
	}
	
	public static void totalEmployee() {
		System.out.println("Total Employee: "+count );
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setbSal(double bSal) {
		this.bSal = bSal;
		calculateSal();
	}
	
	public double getbSal() {
		return bSal;
	}
	
	public void setNetSal(double netSal) {
		this.netSal = netSal;
	}
	
	public double getNetSal() {
		return netSal;
	}
	
	public void setgSal(double gSal) {
		this.gSal = gSal;
	}
	
	public double getgSal() {
		return gSal;
	}
	
    private void calculateSal() {
        this.hra = 0.5 * bSal;
        this.pf = 0.12 * bSal; 
        this.gSal = bSal + hra + medical;
        this.netSal = gSal - (pf + pt);
    }
	
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + bSal);
        System.out.println("HRA: " + hra);
        System.out.println("Medical: " + medical);
        System.out.println("PF: " + pf);
        System.out.println("PT: " + pt);
        System.out.println("Gross Salary: " + gSal);
        System.out.println("Net Salary: " + netSal);
    }
    
    @Override
    public String toString() {
    	return "Emp Id : "+empId+" | Emp Name : "+empName+" | Basic Salary : "+bSal ;
    }
    
    public static void main(String[] args) {
		Employee e1 = new Employee(15,"Sarvesh",600000,50000);
		System.out.println(e1);
		//output : Emp Id : 15 | Emp Name : Sarvesh | Basic Salary : 600000.0
	}
}
