package SKK_Day03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int yearCheck;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input the number to check : ");
		yearCheck = kb.nextInt();

		if (yearCheck % 400 == 0) {
			System.out.println("The year " + yearCheck + " is leap year !");

		} else if (yearCheck % 4 == 0 && yearCheck % 100 !=0) {
			System.out.println("The year " + yearCheck + " is leap year !");
		} else {
			System.out.println("The year " + yearCheck + " is NOT leap year !!");
		}
		kb.close();

	}

}
