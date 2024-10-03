package day9_2;

class Outer{
	public int n;
	Employee e = new Employee()
	{//start class
		int insentive = 1000;
		@Override
		public void display() {
			super.display();
			System.out.println("Insentives : "+insentive);
		}
	};//end class
	
	I i = new I()
	{
		@Override
		public void show() {
			System.out.println("Hi ! from show mwthod..");
		}
	};
}

public class AnonymousClassDemo {
	public static void main(String[] args) {
		Outer ob = new Outer();
		ob.n = 10;
		ob.e.display();
		ob.i.show();
	}
}
