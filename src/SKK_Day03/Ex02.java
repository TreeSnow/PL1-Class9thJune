package SKK_Day03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		int num1, num2, num3, num4, max;

		System.out.println("Input first number : ");
		num1 = kb.nextInt();
		System.out.println("Input second number : ");
		num2 = kb.nextInt();
		System.out.println("Input third number : ");
		num3 = kb.nextInt();
		System.out.println("Input fourth number : ");
		num4 = kb.nextInt();

		if (num1 > num2) {
			max = num1;
		} else if (num2 > num3 && num3 > num4) {
			max = num2;
		} else if (num3 > num4) {
			max = num3;
		} else {
			max = num4;
		}
		kb.close();
		System.out.println("Max number is " + max);
	}

}
