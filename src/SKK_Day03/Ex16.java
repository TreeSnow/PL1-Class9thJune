package SKK_Day03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double basicSal, grossSal, hra1 = 0.2, hra2 = 0.25, hra3 = 0.3, da1 = 0.8, da2 = 0.9, da3 = 0.95;

		Scanner kb = new Scanner(System.in);
		System.out.print("What is the basic salary ?");
		basicSal = kb.nextDouble();

		if (basicSal <= 10000) {
			grossSal = basicSal + (hra1 * basicSal) + (da1 * basicSal);
		} else if (basicSal <= 20000) {
			grossSal = basicSal + (hra2 * basicSal) + (da2 * basicSal);
		} else {
			grossSal = basicSal + (hra3 * basicSal) + (da3 * basicSal);

		}

		System.out.printf("Based on the basic salary %.2f CAD the gross salary is : %.2f CAD %n ", basicSal, grossSal);
		kb.close();

	}

}
