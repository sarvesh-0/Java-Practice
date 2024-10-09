package lamdaexp;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Inter1 r = (n)->System.out.println("Cube = "+(n*n*n));
		r.cube(sc.nextInt());
		sc.close();
	}

}
