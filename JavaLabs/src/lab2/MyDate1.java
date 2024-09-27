package lab2;

//Create two objects and initialize them using no-argument and parameterized constructor respectively. Print the date.

public class MyDate1 
{
	int d;
	int m;
	int y;
	
	public MyDate1() {
		d=m=y=0;   // chain assignment 
	}
	
	public MyDate1(int d,int m,int y) {
		this.d=d;
		this.m=m;
		this.y=y;
	} 
	
	public void getDate() {
		System.out.println("Date: "+d+"/"+m+"/"+y);
	}
	
	public static void main(String[] args) {
		MyDate1 d = new MyDate1(2,2,2002);
		d.getDate();
	}
}
