/*
 Write a class StringDemo to reverse the String using the StringBuffer.
 */
package lab18;

import java.util.Scanner;
public class StringDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		StringBuffer s = new StringBuffer(sc.next());
//		s.reverse();
		int len = s.length();

		for(int i=0; i<len/2; i++) {
			char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(len - 1 - i));
            s.setCharAt(len - 1 - i, temp);
		}
		System.out.println("Reverse = "+s);
	}
}
