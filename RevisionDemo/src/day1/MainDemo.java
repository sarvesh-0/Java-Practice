package day1;

public class MainDemo {

	public static void main(String[] args) {
		Gen <Integer,String> ob1 = new Gen<>(10,"Hello");
		Integer i1 = ob1.getOb1();
		String str = ob1.getOb2();
		System.out.println("Value of i1  : "+i1);
		System.out.println("Value of str : "+str);
	}//end main
}//end class
