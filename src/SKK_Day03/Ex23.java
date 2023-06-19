package SKK_Day03;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int orgNum, comp, reverse = 0;

		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number of five digits : ");
		orgNum = kb.nextInt();
		comp = orgNum;

//		while (orgNum != 0) {
//			reverse = (reverse * 10) + (orgNum % 10);
//			orgNum /= 10;
//
//		}

		reverse = (reverse * 10) + (orgNum % 10); // transfer 1's digit
		orgNum /= 10;
		reverse = (reverse * 10) + (orgNum % 10); // transfer 10's digit
		orgNum /= 10;
		reverse = (reverse * 10) + (orgNum % 10); // transfer 100's digit
		orgNum /= 10;
		reverse = (reverse * 10) + (orgNum % 10); // transfer 1000's digit
		orgNum /= 10;
		reverse = (reverse * 10) + (orgNum % 10); // transfer 10000's digit
		orgNum /= 10;

		System.out.println("Reversed number is " + reverse);
		System.out.println("Original number is " + comp);

		if (reverse == comp) {
			System.out.println("Reversed number is same with the Original number !");

		} else {
			System.out.println("Reversed number is different from the Original number !");
		}

		kb.close();

	}

}
