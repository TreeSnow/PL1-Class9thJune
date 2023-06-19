package SKK_Day03;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double time;
		int div;

		Scanner kb = new Scanner(System.in);
		System.out.println("How long does it take for the worker to complete the job ? [hrs] ");
		time = kb.nextDouble();

		if (time < 3) {
			div = 1;
		} else if (time < 4) {
			div = 2;
		} else if (time <= 5) {
			div = 3;
		} else {
			div = 4;
		}

		switch (div) {
		case 1:
			System.out.println("The worker is highly efficient !");
			break;
		case 2:
			System.out.println("The worker needs to be instructed to improve speed !");
			break;
		case 3:
			System.out.println("The worker should be given training !");
			break;
		case 4:
			System.out.println("The worker should leave the company !");
			break;
		default:
			System.out.println("");
			break;
		}

		kb.close();
	}

}
