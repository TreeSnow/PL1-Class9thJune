package SKK_Day03;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner kb = new Scanner(System.in);
		num = kb.nextInt();

		if (num % 5 == 0) {
			System.out.printf("The number %d is a multiple of 5 !", num);

		} else {
			System.out.printf("The number %d is not a multiple of 5 !", num);
		}

		kb.close();

	}

}
