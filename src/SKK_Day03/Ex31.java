package SKK_Day03;

import java.util.Scanner;

public class Ex31 {

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

		if (num1 == num2) {
			if (num2 == num3) {
				check = 1;

			} else {
				check = 2; // num2 != num3
			}

		} else if (num2 == num3) {
			check = 3; // num1 != num2
		} else if (num1 == num3) {
			check = 4; 
		} else {
			check = 5;
		}

		switch (check) {
		case 1:
			System.out.println("Three numbers are equal !!");
			break;
		case 2:
			System.out.println("Only first and second number are equal !!");
			break;
		case 3:
			System.out.println("Only second and third number are equal !!");
			break;
		case 4:
			System.out.println("Only first and third number are equal !!");
			break;
		default:
			System.out.println("All three numbers are different !!");
			break;

		}

		kb.close();

	}

}
