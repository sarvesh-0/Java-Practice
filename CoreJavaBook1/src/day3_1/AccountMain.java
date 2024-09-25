package day3_1;

class Account{
	static float intrestRate;
	static {
		intrestRate = 2.2f;
	}
	public static float getIntrestRate() {
		return intrestRate;
	}
}

public class AccountMain {

	public static void main(String[] args) {
		System.out.println(Account.getIntrestRate());
	}

}
