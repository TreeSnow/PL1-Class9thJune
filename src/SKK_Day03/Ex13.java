package SKK_Day03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		double a, b, c, x1, x2, D;

		System.out.println("Input the constant of X^2 of quadratic equation : ");
		a = kb.nextDouble();
		System.out.println("Input the constant of X of quadratic equation : ");
		b = kb.nextDouble();
		System.out.println("Input the constant of quadratic equation : ");
		c = kb.nextDouble();

		// Quadratic Equation : aX^2 + bX + c = 0
		// D = b^2 - 4ac
		// x = (-b +- root(D)) /2a

		D = Math.pow(b, 2) - 4 * a * c;

		x1 = (-b) / (2 * a);
		x2 = Math.sqrt(Math.abs(D)) / (2 * a);

		if (D > 0) {

			System.out.printf("Quadratic equation : %.0fX^2 + %.0fX + %.0f = 0 %n", a, b, c);
			System.out.printf("first real root X = %.2f  %n", (x1 + x2));
			System.out.printf("second real root X = %.2f  %n", (x1 - x2));

		} else if (D < 0) {
			System.out.printf("Quadratic equation : %.0fX^2 + %.0fX + %.0f = 0 %n", a, b, c);
			System.out.printf("first complex root X = %.2f + %.2fi %n", x1, x2);
			System.out.printf("second complex root X = %.2f - %.2fi %n", x1, x2);

		} else {
			System.out.printf("Quadratic equation : %.0fX^2 + %.0fX + %.0f = 0 %n", a, b, c);
			System.out.println("repeated root X = " + x1);
		}

		kb.close();

	}

}
