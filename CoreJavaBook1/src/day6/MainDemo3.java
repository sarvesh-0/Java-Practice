package day6;

class Emp2
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
class Mgr2 extends Emp2
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
class SalesMgr2 extends Emp2
{
   public void m3()
   {
	   System.out.println("M3 method....");
   }
   @Override
   public void calculateSalary()
   {
	   System.out.println("HRA+DA+BSAL+Allowans");
   }
}

public class MainDemo3
{
 public static void main(String[] args) 
 {
	 
  // Super class reference refer to subclass object 	 
   System.out.println("\n\nEmployee:");	 
   Emp2 e= new Emp2();
   e.m1();
   e.calculateSalary();
   
   System.out.println("\n\nManager:");
   e= new Mgr2();
   e.m1();
   ((Mgr2)e).m2();   //down casting call special methods
   e.calculateSalary();
   
   System.out.println("\n\nSalesManager:");
   e= new SalesMgr2();
   e.m1();
   ((SalesMgr2)e).m3(); //down casting call special methods
   e.calculateSalary();
   
	 
	 

 }
}