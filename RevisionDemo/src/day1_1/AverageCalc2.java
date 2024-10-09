package day1_1;

public class AverageCalc2<T extends Number> {
	T [] arr;
	
	public AverageCalc2(T[] arr) {
		super();
		this.arr = arr;
	}

	public double average() {
		double sum = 0.0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i].doubleValue();
		}
		return sum/arr.length;
	}
	
	public boolean isSameAvg(AverageCalc2<?> ob) //wild card character
	{
		if(this.average()==ob.average()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Integer iArr [] = {10,40,90,70};
		AverageCalc2<Integer> iob = new AverageCalc2<>(iArr);
		System.out.println("Integer arr Average: "+iob.average());
		
		Double dArr [] = {10.0,40.0,90.0,70.0};
		AverageCalc2<Double> dob = new AverageCalc2<>(dArr);
		System.out.println("Double arr Average: "+dob.average());
		
		if(iob.isSameAvg(dob)) {
			System.out.println("Same Average !");
		}
		else {
			System.out.println("Different Average !");
		}
	}

}
