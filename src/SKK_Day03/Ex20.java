package SKK_Day03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double grossSal, basicSal, hra1 = 0.1, da1 = 0.9, da2 = 0.98;

		Scanner kb = new Scanner(System.in);
		System.out.print("What is the basic salary ?");
		basicSal = kb.nextDouble();

		if (basicSal < 1500) {
			grossSal = basicSal + (hra1 * basicSal) + (da1 * basicSal);
		} else {
			grossSal = basicSal + 500 + (da2 * basicSal);

		}

		System.out.printf("Based on the basic salary %.2f Rs. the gross salary is : %.2f Rs. %n ", basicSal, grossSal);
		kb.close();

	}

}
