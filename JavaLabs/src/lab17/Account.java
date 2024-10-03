/*
 Describe the ‘Account’ class with attributes like accountId,accountName,balance.In ‘Account’ class there is a class called it as ‘Locker’ which keep information regarding ‘Locker’
  like locId.Print ‘Account’ information inside ‘Locker’ class.
 */
package lab17;

public class Account {
	public int accountId;
	public String accountName;
	public double balance;
	public Account() {
		this.accountId = 101;
		this.accountName = "Sarvesh";
		this.balance = 80000;
	}
	
	class Locker{
		int locId = 222;
	
		public void print() {
			System.out.println("Account ID   : "+accountId);
			System.out.println("Account Name : "+accountName);
			System.out.println("Balance      : "+balance);
			System.out.println("Loc Id       : "+locId);
		}
		
	}
	
	public static void main(String[] args) {
		Account a = new Account();
		Account.Locker l = a.new Locker();
		l.print();
	}
}
