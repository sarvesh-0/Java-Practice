package pb5;

import java.util.ArrayList;
import java.util.Scanner;

public class StringDemo {

//	public ArrayList <String> upperFirstWord(String [] ar) {
//		ArrayList <String> sen= new ArrayList<>();
//		for(String w: ar) {
//			if(Character.isUpperCase(w.charAt(0))) {
//				System.out.println("Already in Upercase ...");
//			}
//			else {
//				String cw = w.substring(0,1).toUpperCase()+w.substring(1);  
//				sen.add(cw);
//			}
//		}
//		return sen;
//	}
	
	public void capitalize(String sen) {
	    StringBuilder res = new StringBuilder();
	    boolean capitalizeNext = true;  // Flag to indicate if we need to capitalize the next character

	    for (int i = 0; i < sen.length(); i++) {
	        char ch = sen.charAt(i);
	        
	        // If the current character is a space, the next character should be capitalized
	        if (ch == ' ') {
	            res.append(ch);  // Append the space
	            capitalizeNext = true;  // Set flag to capitalize the next character
	        } else if (capitalizeNext) {
	            if (Character.isUpperCase(ch)) {
	                System.out.println(ch + " is already in Uppercase...");
	            } else {
	                ch = Character.toUpperCase(ch);  // Capitalize the character
	            }
	            res.append(ch);  // Append the capitalized character
	            capitalizeNext = false;  // Reset flag
	        } else {
	            res.append(ch);  // If not the first letter of a word, append as is
	        }
	    }
	    System.out.println("Capitalized Sentence: " + res.toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine().trim();
		
		StringDemo s = new StringDemo();
//		String words [] = str.split(" ");
//		StringBuilder  ans = new StringBuilder();
//		System.out.println(ans);
		s.capitalize(str);
		
	}

}
