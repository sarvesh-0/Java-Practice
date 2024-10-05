/*
A company wants to give a facility of user name and password to its some employees to access some critical information. To generate a password.
a. Minimum 8 characters
b. Must contain at least one uppercase, one lowercase and one special character
c. Only special characters @, *, # are allowed
If the password does not meet the above criteria, an error message needs to be displayed.
 */
package pb2;

import java.util.Scanner;

class PassLengthException extends Exception{
	String msg;
	public PassLengthException() {
		this.msg = "PassLengthException";
	}
	
	public String toString() {
		return msg;
	}
	
	public String getMessage() {
		return msg;
	}
}

class InvalidPassException extends Exception{
	String msg;
	public InvalidPassException() {
		this.msg = "InvalidPassException..";
	}
	
	public String toString() {
		return msg;
	}
	
	public String getMessage() {
		return msg;
	}
}

class InvalidSpecialCharException extends Exception{
	String msg;
	public InvalidSpecialCharException() {
		this.msg = "InvalidSpecialCharException..";
	}
	
	public String toString() {
		return msg;
	}
	
	public String getMessage() {
		return msg;
	}
}


public class GenratePass {
	
	public static void main(String[] args) {
		String uname;
		String upass;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter User Name : ");
		uname = sc.next();
		System.out.print("\nEnter User Password : ");
		upass = sc.next();
		
		try {
			if(upass.length()<8) {
				throw new PassLengthException();
			}
			else if(!upass.matches("^(?=.*[a-z])(?=.*[A-Z]).+$")) {
				throw new InvalidPassException();
			}
			else if(!upass.matches("(?=.*[@*#]).+$")) {
				throw new InvalidSpecialCharException();
			}
			else {
				System.out.println("UserName ans Password is Successfully Registerd");
			}
		}catch(PassLengthException e) {
			System.out.println("Password Should be of minimum 8 characters..");
		}catch(InvalidPassException e) {
			System.out.println("Password must contain one Uppercase one Lowercase and one Special Charecter..");
		}catch(InvalidSpecialCharException e) {
			System.out.println("Only Special Characters @,*,# are allowed..");
		}

	}
}
