package day2HW;

public class Account {
	int accNo ;
	String ownername;
	double balance;
	
	public void setAccNo(int ano) {
		accNo = ano;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setOwnername(String on) {
		ownername = on;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAccNo(1002);
		a1.setBalance(12500);
		a1.setOwnername("Sarvesh");
		System.out.println("Owner Name: "+a1.getOwnername());
		System.out.println("Account no: "+a1.getAccNo());
		System.out.println("Balance: "+a1.getBalance());
	}
}
