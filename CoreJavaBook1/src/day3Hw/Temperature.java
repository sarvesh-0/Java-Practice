package day3Hw;
/*
 Write a temperature converter method which accepts temperature in Celsius and returns in Fahrenheit.
 */
import java.util.Scanner;

public class Temperature {
	
	public float convert(int t) {
		float tempinF = t*(9/5)+32;
		return tempinF;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temp in Celsius : ");
		int t = sc.nextInt();
		sc.close();
		System.out.println("Temperature is "+t+" in Celsius ...");
		Temperature t1 = new Temperature();
		float temp = t1.convert(t);
		System.out.println("Temperature is "+temp+" in Fahrenheit ...");
	}

}
