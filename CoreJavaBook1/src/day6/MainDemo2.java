package day6;

class Emp1
{
   public void m1()
   {
	   System.out.println("M1 method....");
   }
   public void calculateSalary()
   {
	   System.out.println("HRA+DA+BSAL");
   }
}
class Mgr1 extends Emp1
{
   public void m2()
   {
	   System.out.println("M2 method....");
   }
   @Override
   public void calculateSalary()
   {
	   System.out.println("HRA+DA+BSAL+Incentives");
   }
}
class SalesMgr1 extends Emp1
{
   public void m3()
   {
	   System.out.println("M2 method....");
   }
   @Override
   public void calculateSalary()
   {
	   System.out.println("HRA+DA+BSAL+Allowans");
   }
}

public class MainDemo2
{
 public static void main(String[] args) 
 {
	 
  // Super class reference refer to subclass object 	 
   System.out.println("\n\nEmployee:");	 
   Emp1 e= new Emp1();
   e.m1();
   e.calculateSalary();
   
   System.out.println("\n\nManager:");
   e= new Mgr1();
   e.m1();
   //e.m2();   error for special methods
   e.calculateSalary();
   
   System.out.println("\n\nSalesManager:");
   e= new SalesMgr1();
   e.m1();
   //e.m3();  error for special methods
   e.calculateSalary();
   
	 
	 

 }
}