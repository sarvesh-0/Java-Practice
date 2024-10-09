package methodrefrance;

public class PersonComparator {
	
	public static int compareAge(Person a, Person b) {
		return a.getAge() - b.getAge();
	}
	
	public int compareName(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}
	
}
