package day7;

public class TestMain {
	public static void main(String[] args) {
		MobilePhone m ;
		m = new SimplePhone();
		m.makeCall();
		
		m = new SmartPhone();
		m.makeCall();
	}
}
