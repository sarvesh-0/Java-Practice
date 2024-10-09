package day1;

public class Gen<T,V> {
	T ob1;
	V ob2;
	
	public Gen(T ob1, V ob2) {
		super();
		this.ob1 = ob1;
		this.ob2 = ob2;
	}

	public T getOb1() {
		return ob1;
	}

	public V getOb2() {
		return ob2;
	}
	
}//end class
