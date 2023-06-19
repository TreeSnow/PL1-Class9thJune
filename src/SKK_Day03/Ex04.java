package SKK_Day03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numCheck;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input the number to check : ");
		numCheck = kb.nextInt();

		if (numCheck % 5 == 0 && numCheck % 11 == 0) {
			System.out.println("The number " + numCheck + " is divisible by 5 and 11 !");

		} else if (numCheck % 5 == 0) {
			System.out.println("The number " + numCheck + " is divisible only by 5 !");
		} else if (numCheck % 11 == 0) {
			System.out.println("The number " + numCheck + " is divisible only by 11 !");
		} else {
			System.out.println("The number is not divisible by 5 or 11 !");
		}
		kb.close();
	}

}
