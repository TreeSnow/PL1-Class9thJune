package SKK_Day03;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sal = 0;
		int gender, qualification, servYear;

		Scanner kb = new Scanner(System.in);
		System.out.println("What is the gender of employee ? (Select number :  #1. Male | #2. Female )");
		gender = kb.nextInt();

		System.out.println("Qualification ? (Select number :  #1. Post-Graduate | #2. Graduate )");
		qualification = kb.nextInt();

		System.out.println("How many years worked the employee ? ");
		servYear = kb.nextInt();

		switch (gender) {

		case 1:
			if (qualification == 1) {
				if (servYear >= 10) {
					sal = 15000;
				} else {
					sal = 10000;
				}
				System.out.printf("Employee's salary is %.2f %n", sal);
			} else if (qualification == 2) {
				if (servYear >= 10) {
					sal = 10000;
				} else {
					sal = 7000;
				}
				System.out.printf("Employee's salary is %.2f %n", sal);
			} else {
				System.out.println("[ Warning ] You did input wrong qualification !!");
				System.out.println("There is no information that meets the condition !!");
			}
			break;
		case 2:
			if (qualification == 1) {
				if (servYear >= 10) {
					sal = 12000;
				} else {
					sal = 10000;
				}
				System.out.printf("Employee's salary is %.2f %n", sal);
			} else if (qualification == 2) {
				if (servYear >= 10) {
					sal = 9000;
				} else {
					sal = 6000;
				}
				System.out.printf("Employee's salary is %.2f %n", sal);
			} else {
				System.out.println("[ Warning ] You did input wrong qualification !!");
				System.out.println("There is no information that meets the condition !!");
			}
			break;

		default:
			System.out.println("[ Warning ] You did input wrong gender information !!");
			System.out.println("There is no information that meets the condition !!");
			break;
		}
		kb.close();
	}

}
