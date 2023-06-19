package SKK_Day03;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double avgMark, sub1, sub2, sub3, sub4, sub5;
		String grade;

		Scanner kb = new Scanner(System.in);
		System.out.print("Give me the first subject's score ? ");
		sub1 = kb.nextDouble();
		System.out.print("Give me the second subject's score ? ");
		sub2 = kb.nextDouble();
		System.out.print("Give me the third subject's score ? ");
		sub3 = kb.nextDouble();
		System.out.print("Give me the fourth subject's score ? ");
		sub4 = kb.nextDouble();
		System.out.print("Give me the fifth subject's score ? ");
		sub5 = kb.nextDouble();


		avgMark = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;

		if (avgMark >= 60) {
			grade = "First division";
		} else if (avgMark >= 50) {
			grade = "Second division";
		} else if (avgMark >= 40) {
			grade = "First division";
		} else {
			grade = "Fail";
		}

		System.out.printf("Based on your mark of %.2f the grade is %s ", avgMark, grade);
		kb.close();
	}

}
