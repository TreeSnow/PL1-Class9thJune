package SKK_Day03;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		int num1, num2, num3, check;

		System.out.println("Input the first number : ");
		num1 = kb.nextInt();
		System.out.println("Input the second number : ");
		num2 = kb.nextInt();
		System.out.println("Input the third number : ");
		num3 = kb.nextInt();

		if (num1 < num2) {
			if (num2 < num3) {
				check = 1; // numbers are increasing!!

			} else {
				check = 2; // *increase : num1 -> num2/ *decrease : num2 -> num3 or equal cases
			}

		} else if (num2 > num3) {
			check = 3; // numbers are decreasing!!
		} else  {
			check = 4; // *decrease : num1 -> num2/ *increase : num2 -> num3  OR equal cases
		} 

		switch (check) {
		case 1:
			System.out.println("The numbers are in increasing order !!");
			break;
		case 2:
			System.out.println("The numbers are not in order !!");
			break;
		case 3:
			System.out.println("The numbers are in decreasing order !!");
			break;
		default:
			System.out.println("The numbers are not in order !!");
			break;

		}

		kb.close();
	}

}
