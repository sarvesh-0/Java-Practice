package methodrefrence1;

public class Person1 {
	int age;
	String name;
	
	public Person1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		PersonFactory p = Person1 :: new;		//constructor accessed using 
		
		System.out.println("Constructor isn't called yet");
		System.out.println(p.get(30, "Shilpa"));
	}
	
}
