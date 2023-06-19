package SKK_Day03;

import java.util.Scanner;

public class Ex03 {

	static final double HST = 0.13;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

		int carrotPrice = 2, onionPrice = 4, meatPrice = 10, selectNum, selectPay;
		double pricetoPay = 0, lbCarrot = 0, lbOnion = 0, lbMeat = 0;


		System.out.println("Select the number of product which you want to buy :  ");
		System.out.println("#1. Carrot		#2. Onion		#3. Meat   ");

		selectNum = kb.nextInt();

		switch (selectNum) {

		case 1:
			System.out.println("How much [lbs] of Carrot do you need?");
			lbCarrot = kb.nextDouble();
			break;
		case 2:
			System.out.println("How much [lbs] of Onion do you need?");
			lbOnion = kb.nextDouble();
			break;
		case 3:
			System.out.println("How much [lbs] of Meat do you need?");
			lbMeat = kb.nextDouble();
			break;
		}

		System.out.println("Do you need to order another item? (y or n)");
		String another = kb.next();
		if (another.equalsIgnoreCase("y")) {
			System.out.println("Select the number of product which you want to buy :  ");
			System.out.println("#1. Carrot		#2. Onion		#3. Meat   ");

			selectNum = kb.nextInt();

			switch (selectNum) {

			case 1:
				System.out.println("How much [lbs] of Carrot do you need?");
				lbCarrot = kb.nextDouble();
				break;
			case 2:
				System.out.println("How much [lbs] of Onion do you need?");
				lbOnion = kb.nextDouble();
				break;
			case 3:
				System.out.println("How much [lbs] of Meat do you need?");
				lbMeat = kb.nextDouble();
				break;
			}

		} else {
			System.out.println("");
		}

		System.out.println("Thank you for your purchase!");
		System.out.println("How do you prefer to pay? (#1. Cash | #2. Card)");

		selectPay = kb.nextInt();

		switch (selectPay) {

		case 1:
			pricetoPay = (lbCarrot * carrotPrice) + (lbOnion * onionPrice) + (lbMeat * meatPrice);
			break;
		case 2:
			pricetoPay = (lbCarrot * carrotPrice) + (lbOnion * onionPrice) + (lbMeat * meatPrice);
			pricetoPay += pricetoPay*HST;
			break;
		}

		System.out.println("************ Your Purchase items ***************");
		if (lbCarrot != 0) {

			System.out.println("# Carrot : " + lbCarrot + " lb X $2");
		}
		if (lbOnion != 0) {

			System.out.println("# Onion : " + lbOnion + " lb X $4");
		}
		if (lbMeat != 0) {

			System.out.println("# Meat : " + lbMeat + " lb X $10");
		}

		System.out.println("");
		System.out.println("************ Your Payment ***************");
		System.out.printf("Total : %10.2f CAD", pricetoPay);
		kb.close();
	}

}
