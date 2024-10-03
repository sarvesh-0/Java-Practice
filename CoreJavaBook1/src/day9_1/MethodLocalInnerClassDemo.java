package day9_1;

class Outer{
	int n;
	static int cnt = 10;
	Outer(){
		n=10;
	}
	public static void displayCnt() {
		System.out.println("Value of cnt : "+cnt);
	}
	//jdk7
	public void m1() {
		final int z=100; //local variable
		class Inner{ //Method Local Inner Class
			int a;
			Inner(){
				a=20;
			}
			public void display() {
				System.out.println("Value of a: "+a);
				System.out.println("Value of z: "+z);
			}
		}
		
		Inner ob = new Inner();
		ob.display();
	}
}
public class MethodLocalInnerClassDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.displayCnt();
		o.m1();
	}
}
