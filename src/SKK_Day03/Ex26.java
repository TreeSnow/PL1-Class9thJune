package SKK_Day03;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, abs;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input integer number : ");
		x = kb.nextDouble();

		abs = Math.abs(x);

		System.out.printf("Absolute number of %.2f is : %.02f", x, abs);

		kb.close();

	}

}
