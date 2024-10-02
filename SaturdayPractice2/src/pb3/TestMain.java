package pb3;

public class TestMain {
	public static void show(Person p) {
		p.displayDetails();
	}
	public static void main(String[] args) {
		Person n;
		n = new Nurse("ABC",5,"Evening",1000);
		show(n);
		n = new Doctor("Sarvesh",80000,"Cardiologist");
		show(n);
	}
}
