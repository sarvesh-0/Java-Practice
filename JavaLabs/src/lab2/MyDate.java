package lab2;

//Create an object and initialize it using mutator methods and accesses it using accessor methods. Print the date.

public class MyDate {
	
	int d;
	int m;
	int y;
	
	public void setDate(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}
	
	public void getDate() {
		System.out.println("Date: "+d+"/"+m+"/"+y);
	}
	
	public static void main(String[] args) {
		MyDate d = new MyDate();
		d.setDate(1, 1, 2002);
		d.getDate();
	}
}
