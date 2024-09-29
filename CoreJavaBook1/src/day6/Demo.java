package day6;

public class Demo 
{
  int x;
  int y;
  public Demo() 
  {
	x=10;
	y=20;
  }
  public Demo(int x,int y) 
  {
	this.x=x;
	this.y=y;
  }
  @Override
  public String toString()
  {
	  return " x:"+x+" y:"+y;
  }
  public static void main(String[] args) 
  {
	Demo d1= new Demo();
	Demo d2= new Demo();
	Demo d3= d1; // alaise
	System.out.println("d1:"+d1);
	System.out.println("d2:"+d2);
	System.out.println("d3:"+d3);
	
	// equals method   ref--- memory location 
	System.out.println("d1 equals d2:"+(d1.equals(d2)));
	System.out.println("d1 equals d3:"+(d1.equals(d3)));
	
	// == operator   ref--- memory location 
	System.out.println("d1 == d2:"+(d1==d2));
	System.out.println("d1 == d3:"+(d1==d3));
	
	//hashcode() method 
	System.out.println("d1 hash code:"+d1.hashCode());
	System.out.println("d2 hash code:"+d2.hashCode());
	System.out.println("d3 hash code:"+d3.hashCode());
	
	
	
  }
}
