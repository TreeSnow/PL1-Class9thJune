package SKK_Day03;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hard, tensile, carbon, grade;

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the hardness :");
		hard = kb.nextDouble();
		System.out.println("Input the Carbon content (%) :");
		carbon = kb.nextDouble();
		System.out.println("Input the Tensile strength :");
		tensile = kb.nextDouble();

		if (hard > 50) {
			if (carbon < 0.7) {
				if (tensile > 5600) {
					grade = 10;
				} else {
					grade = 9;
				}
			} else if (tensile > 5600) {
				grade = 7;
			} else {
				grade = 6;

			}
		} else if (carbon < 0.7) {
			if (tensile > 5600) {
				grade = 8;
			} else {
				grade = 6;
			}

		} else if (tensile > 5600) {
			grade = 6;
		} else {
			grade = 5;
		}

		System.out.printf("The grade of steel is : %.0f %n", grade);

		kb.close();

	}

}
