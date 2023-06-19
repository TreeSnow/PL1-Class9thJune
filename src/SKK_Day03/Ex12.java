package SKK_Day03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double len1, len2, len3;
		int checkType;
		boolean check1, check2, check3;

		Scanner kb = new Scanner(System.in);

		System.out.println("Input first side's length of triangle : ");
		len1 = kb.nextDouble();
		System.out.println("Input second side's length of triangle : ");
		len2 = kb.nextDouble();
		System.out.println("Input third side's length of triangle : ");
		len3 = kb.nextDouble();

		check1 = ((len2 + len3) > len1) ? true : false;
		check2 = ((len1 + len3) > len2) ? true : false;
		check3 = ((len1 + len2) > len3) ? true : false;

		if (check1 && check2 && check3) {

			if ((len1 == len2) && (len2 == len3)) {
				checkType = 1; // Equilateral Triangle
			} else if ((len1 == len2) || (len2 == len3)) {
				checkType = 2; // Isosceles Triangle
			} else {
				checkType = 3; // Scalene Triangle
			}

			switch (checkType) {

			case 1:
				System.out.println("This is an Equilateral Triangle !");
				break;
			case 2:
				System.out.println("This is an Isosceles Triangle !");
				break;
			case 3:
				System.out.println("This is an Scalene Triangle !");
				break;
			default:

				break;
			}

		} else {
			System.out.println("Triangle is not valid !!");
		}

		kb.close();

	}

}
