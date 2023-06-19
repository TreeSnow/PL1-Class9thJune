package SKK_Day03;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double avgMark, physics, chem, biology, math, computer;
		char grade;

		Scanner kb = new Scanner(System.in);
		System.out.print("Give me your Physics score ? ");
		physics = kb.nextDouble();
		System.out.print("Give me your Chemistry score ? ");
		chem = kb.nextDouble();
		System.out.print("Give me your Biology score ? ");
		biology = kb.nextDouble();
		System.out.print("Give me your Mathematics score ? ");
		math = kb.nextDouble();
		System.out.print("Give me your Computer score ? ");
		computer = kb.nextDouble();

		avgMark = (physics + chem + biology + math + computer) / 5;

		if (avgMark >= 90) {
			grade = 'A';
		} else if (avgMark >= 80) {
			grade = 'B';
		} else if (avgMark >= 70) {
			grade = 'C';
		} else if (avgMark >= 60) {
			grade = 'D';
		} else if (avgMark >= 40) {
			grade = 'E';
		} else {
			grade = 'F';
		}

		System.out.printf("Based on your mark of %.2f the grade is : %s ", avgMark, grade);
		kb.close();

	}

}
