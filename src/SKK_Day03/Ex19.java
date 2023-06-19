package SKK_Day03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int curYear, joinYear, servedYear;

		Scanner kb = new Scanner(System.in);

		System.out.println("Input the employee's join year : ");
		joinYear = kb.nextInt();
		System.out.println("What is the current year ? ");
		curYear = kb.nextInt();

		servedYear = curYear - joinYear;

		if (servedYear > 3) {
			System.out.println("Bonus 2500 will be given to the employee !");
		} else {
			System.out.println("There is no bonus !");
		}

		kb.close();

	}

}
