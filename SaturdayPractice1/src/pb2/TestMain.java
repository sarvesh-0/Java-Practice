package pb2;

class VolumeCalculator{
	double radious;
	static double PI = 3.14;
	int length , breadth, height ;
	
	public double calculateVolume(double radious , double height) {
		return PI * radious * radious ;
	}
	
	public double calculateVolume(int length , int breadth, int height) {
		return length*breadth*height ;
	}
}

public class TestMain {
	public static void main(String[] args) {
		VolumeCalculator c = new VolumeCalculator();
		double cr = c.calculateVolume(3.1, 4.1);
		double cu = c.calculateVolume(2, 3, 4);
		System.out.println("Volume of Cylender : "+cr);
		System.out.println("Volume of cuboid : "+cu);
	}
}
