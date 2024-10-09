package methodrefrance;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Person> arr = new ArrayList<Person>();
		arr.add(new Person(23,"Neelam"));
		arr.add(new Person(27,"Prisha"));
		arr.add(new Person(25,"Anay"));
		//Reference to Static Method
		Collections.sort(arr,PersonComparator::compareAge);//method reference operator >> static method accessed using class name
		System.out.println("Sorting using Reference to Static Method");
		for(Person p : arr) {
			System.out.println(p.getAge());
			System.out.println(p.getName());
		}
		System.out.println();
		
		//Reference to Instance Method
		PersonComparator obj = new PersonComparator();
		Collections.sort(arr, obj :: compareName); //Instance method accessed using object name
		System.out.println("Sorting using Reference to Instance Method");
		for(Person p : arr) {
			System.out.println(p.getAge());
			System.out.println(p.getName());
		}
	}
}
