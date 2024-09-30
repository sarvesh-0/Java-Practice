package day7_1;

public class TestMain {
	public static void main(String[] args) {
		RemortDevice r;
		r = new TV();
		r.switchOn();
		r.switchOff();
		
		r = new DVDPlayer();
		r.switchOn();
		r.switchOff();
	}
}
