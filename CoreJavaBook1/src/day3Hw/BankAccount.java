package day3Hw;

import java.util.Scanner;

/*
 Write a Java Program to create a class bank Account having member fields account number,customer name,balance,city and member methods are
 default constructor,parameterized constructor,create account,withdraw amount ,deposit amount,transfer amount from one account to another,display all
 account details,display account details by city name,display account details by account number.
Use Hints:
 Account number is auto generated.
 Display methods are overloaded.
 Array of objects.
 Write Menu Driven Program.
 Add necessary Fields or methods in class.
 */
public class BankAccount {
	int accNo ;
	String custName;
	double balance;
	String city;
	static int count =100;
	
	public BankAccount() {
		count++;
		accNo = count;
	}
	
	public BankAccount(String n, double b, String c) {
		this();
		custName = n;
		balance = b;
		city = c;
	}
	
	public void display() {
		System.out.println("-----------------------------------------------------");
		System.out.println("Account No: " + accNo);
        System.out.println("Customer Name: " + custName);
        System.out.println("Balance: " + balance);
        System.out.println("City: " + city);
        System.out.println("-----------------------------------------------------");
	}
	
    public void displayByAcc(int accountNumber) {
        if (this.accNo == accountNumber) {
            display();
        } else {
            System.out.println("Account not found.");
        }
    }
	
    public void displayByCity(String cityName) {
        if (this.city.equalsIgnoreCase(cityName)) {
            display();
        }
    }
	
	public void createAccount(String n, double b, String c) {
        custName = n;
        balance = b;
        city = c;
        System.out.println("Account created successfully with Account No: " + accNo);
        System.out.println("-------------------------------------------------------");
    }
	
	public void deposit(double amount) {
	    if (amount > 0) {
	    	balance = balance + amount;
	        System.out.println("Amount deposited successfully. New balance: " + balance);
	        System.out.println("---------------------------------------------------");
	    } else {
	        System.out.println("Invalid deposit amount.");
	        System.out.println("---------------------------------------------------");
	    }
	}
	 
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance = balance - amount;
            System.out.println("Amount withdrawal successfully. Remaining balance: " + balance);
            System.out.println("-------------------------------------------------------------");
        } else {
            System.out.println("Invalid or insufficient balance.");
            System.out.println("-------------------------------------------------------------");
        }
    }
    
    public void transfer(BankAccount recipient, double amount) {
        if (amount > 0 && balance >= amount) {
            balance =balance - amount;
            recipient.balance = recipient.balance + amount;
            System.out.println("Amount transferred successfully. Your remaining balance: " + balance);
            System.out.println("-------------------------------------------------------------");
        } else {
            System.out.println("Transfer failed. Check balance or transfer amount.");
            System.out.println("-------------------------------------------------------------");
        }
    }
	
	public static void main(String[] args) {
		BankAccount[] acc = new BankAccount[20];
	    int accCount = 0;
		Scanner sc = new Scanner(System.in);
		int opt ;
		System.out.println("Welcome to the Seed Bank !");
		do {
			System.out.println("Which Transaction do you want to perform ?");
			System.out.println("----------------------TRANSACTIONS-----------------------");
			System.out.println("Enter 1 to create Account");
			System.out.println("Enter 2 to view Account Details");
			System.out.println("Enter 3 to view Account Details by Account No");
			System.out.println("Enter 4 to view Account Details by City");
			System.out.println("Enter 5 to Deposit Amount");
			System.out.println("Enter 6 to Withdraw Amount");
			System.out.println("Enter 7 to Transfer Amount");
			System.out.println("Enter 8 to Exit");
			System.out.println("--------------------------------------------------------");
			System.out.print("Select the Option : ");
			opt = sc.nextInt();
			System.out.println("--------------------------------------------------------");
			switch(opt) {
			case 1:
				sc.nextLine();
                System.out.print("Enter customer name: ");
                String name = sc.nextLine();
                System.out.print("Enter initial balance: ");
                double balance = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter city: ");
                String city = sc.nextLine();
                acc[accCount] = new BankAccount(name, balance, city);
                accCount++;
				break;
				
            case 2:
                for (int i = 0; i < accCount; i++) {
                    acc[i].display();
                    System.out.println("-----------------------------------------------");
                }
                break;
                
            case 3:
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();
                System.out.println("-----------------------------------------------");
                boolean found = false;
                for (int i = 0; i < accCount; i++) {
                    if (acc[i].accNo == accNo) {
                        acc[i].display();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Account not found.");
                }
                break;
                
            case 4:
                sc.nextLine(); // consume newline
                System.out.print("Enter City: ");
                String searchCity = sc.nextLine();
                System.out.println("-----------------------------------------------");
                for (int i = 0; i < accCount; i++) {
                    acc[i].displayByCity(searchCity);
                }
                break;
				
			case 5:
                System.out.print("Enter Account Number to Deposit: ");
                accNo = sc.nextInt();
                System.out.print("Enter Amount to Deposit: ");
                double depositAmount = sc.nextDouble();
                System.out.println("-----------------------------------------------");
                found = false;
                for (int i = 0; i < accCount; i++) {
                    if (acc[i].accNo == accNo) {
                        acc[i].deposit(depositAmount);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Account not found.");
                }
				break;
				
			case 6:
                System.out.print("Enter Account Number to Withdraw: ");
                accNo = sc.nextInt();
                System.out.print("Enter Amount to Withdraw: ");
                double withdrawAmount = sc.nextDouble();
                System.out.println("-----------------------------------------------");
                found = false;
                for (int i = 0; i < accCount; i++) {
                    if (acc[i].accNo == accNo) {
                        acc[i].withdraw(withdrawAmount);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Account not found.");
                }
				break;
				
			case 7:
                System.out.print("Enter Your Account Number: ");
                int fromAccNo = sc.nextInt();
                System.out.print("Enter Recipient's Account Number: ");
                int toAccNo = sc.nextInt();
                System.out.print("Enter Amount to Transfer: ");
                double transferAmount = sc.nextDouble();
                System.out.println("-----------------------------------------------");
                BankAccount fromAccount = null;
                BankAccount toAccount = null;
                
                for (int i = 0; i < accCount; i++) {
                    if (acc[i].accNo == fromAccNo) {
                        fromAccount = acc[i];
                    }
                    if (acc[i].accNo == toAccNo) {
                        toAccount = acc[i];
                    }
                }
                
                if (fromAccount != null && toAccount != null) {
                    fromAccount.transfer(toAccount, transferAmount);
                } else {
                    System.out.println("One or both accounts not found.");
                }
				break;
				
			case 8:
				break;
				
			default:
				System.out.println("Please Enter Valid Option !");
				break;
			}
		}while(opt != 8);
		
	}
}
