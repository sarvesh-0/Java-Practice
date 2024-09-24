package day2HW;

public class MathClass {
	public int add(int a , int b) {
		return a+b;
	}
	
	public int add(int a , int b, int c) {
		return a+b+c;
	}
	
	public int add(int a , int b, int c, int d) {
		return a+b+c+d;
	}
	
	public static void main(String[] args) {
		MathClass m1 = new MathClass();
		System.out.println("2 Arg :"+m1.add(1,2));
		MathClass m2 = new MathClass();
		System.out.println("3 Arg :"+m1.add(1,2,3));
		MathClass m3 = new MathClass();
		System.out.println("4 Arg :"+m1.add(1,2,3,4));
		
	}
}
