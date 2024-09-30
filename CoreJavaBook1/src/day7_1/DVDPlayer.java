package day7_1;

public class DVDPlayer implements RemortDevice{
	@Override
	public void switchOn() {
		System.out.println("DVD Switch is On !");	
	}
	
	@Override
	public void switchOff() {
		System.out.println("DVD Switch is Off !");
	}
}
