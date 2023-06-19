package SKK_Day03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int weekCheck, countDay;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input the number of weeks to check : ");
		weekCheck = kb.nextInt();

		countDay = weekCheck * 7;

		if (weekCheck == 1) {
			System.out.println(weekCheck + " week has " + countDay + " days !!");
		} else {
			System.out.println(weekCheck + " weeks have " + countDay + " days !!");
		}

		kb.close();

	}

}
