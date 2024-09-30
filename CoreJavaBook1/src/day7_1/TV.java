package day7_1;

public class TV implements RemortDevice{
	@Override
	public void switchOn() {
		System.out.println("TV Switch is On !");	
	}
	
	@Override
	public void switchOff() {
		System.out.println("TV Switch is Off !");
	}
}
