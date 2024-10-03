package day9_2;

public class Employee 
{
  int eid;
  String ename;
  int esal;
public Employee() {
	super();
	eid=101;
	ename="amit";
	esal=12000;
}
public Employee(int eid, String ename, int esal) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esal = esal;
}
 public void display()
 {
	 System.out.println("Employee Id:"+eid);
	 System.out.println("Employee Name:"+ename);
	 System.out.println("Employee Salary:"+esal);
 }
 
	
}
