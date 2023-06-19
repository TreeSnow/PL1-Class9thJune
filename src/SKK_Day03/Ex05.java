package SKK_Day03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numCheck;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input the number to check : ");
		numCheck = kb.nextInt();

		if (numCheck % 2 == 0) {
			System.out.println("The number " + numCheck + " is EVEN !");

		}else {
			System.out.println("The number " + numCheck + " is ODD !");
		}
		kb.close();
	}

}
