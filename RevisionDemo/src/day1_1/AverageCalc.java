package day1_1;

public class AverageCalc<T extends Number> {
	T [] arr;
	
	public AverageCalc(T[] arr) {
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
	public static void main(String[] args) {
		Integer iArr [] = {10,40,90,70};
		AverageCalc<Integer> iob = new AverageCalc<>(iArr);
		System.out.println("Integer arr Average: "+iob.average());
		
		Double dArr [] = {23.1,56.4,54.2,44.23};
		AverageCalc<Double> dob = new AverageCalc<>(dArr);
		System.out.println("Double arr Average: "+dob.average());
	}

}
