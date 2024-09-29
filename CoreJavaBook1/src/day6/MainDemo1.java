package day6;

class Emp
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
class Mgr extends Emp
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
class SalesMgr extends Emp
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

public class MainDemo1 
{
 public static void main(String[] args) 
 {
   System.out.println("\n\nEmployee:");	 
   Emp e= new Emp();
   e.m1();
   e.calculateSalary();
   
   System.out.println("\n\nManager:");
   Mgr m= new Mgr();
   m.m1();
   m.m2();
   m.calculateSalary();
   
   System.out.println("\n\nSalesManager:");
   SalesMgr sm= new SalesMgr();
   sm.m1();
   sm.m3();
   sm.calculateSalary();
   
	 
	 

 }
}
