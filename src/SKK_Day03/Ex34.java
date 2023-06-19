package SKK_Day03;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1, num2, res = 0;
		int check = 0;

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the first number : ");
		num1 = kb.nextDouble();
		System.out.println("Input operator to calculate : ( i.e. :  '+' or '-' or '/' or '*' )");
		String symbol = kb.next();
		System.out.println("Input the second number : ");
		num2 = kb.nextDouble();

		if (symbol.equals("+")) {
			check = 1;
			res = num1 + num2;
		} else if (symbol.equals("-")) {
			check = 2;
			res = num1 - num2;
		} else if (symbol.equals("*")) {
			check = 3;
			res = num1 * num2;
		} else if (symbol.equals("/")) {

			if (num2 != 0) {
				res = num1 / num2;
				check = 4;
			} else {
				System.out.println("Can't divide by 0 !!");
			}

		} else {
			System.out.println("Wrong operator!!");
		}

		switch (check) {

		case 1:
			System.out.printf("%.2f + %.2f = %.2f %n", num1, num2, res);
			break;
		case 2:
			System.out.printf("%.2f - %.2f = %.2f %n", num1, num2, res);
			break;
		case 3:
			System.out.printf("%.2f * %.2f = %.2f %n", num1, num2, res);
			break;
		case 4:
			System.out.printf("%.2f / %.2f = %.2f %n", num1, num2, res);
			break;

		default:
			break;

		}
		kb.close();

	}

}
