package SKK_Day03;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double ang1, ang2, ang3, add;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input first angle of triangle : ");
		ang1 = kb.nextDouble();
		System.out.println("Input second angle of triangle : ");
		ang2 = kb.nextDouble();
		System.out.println("Input third angle of triangle : ");
		ang3 = kb.nextDouble();

		add = ang1 + ang2 + ang3;
		
		if (add == 180) {
			System.out.println("Triangle is valid !!");
		} else {
			System.out.println("Triangle is not valid !!");
		}
		kb.close();
	}

}
