package SKK_Day03;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double totRevenu, totExpense, res;

		Scanner kb = new Scanner(System.in);
		System.out.println("Input total revenu : ");
		totRevenu = kb.nextDouble();
		System.out.println("Input total expenses : ");
		totExpense = kb.nextDouble();

		res = totRevenu - totExpense;

		if (res > 0 || res == 0) {
			System.out.printf("Profit is %.2f CAD %n", res);

		} else {

			System.out.printf("Loss is %.2f CAD %n", res);
		}
		kb.close();
	}

}
