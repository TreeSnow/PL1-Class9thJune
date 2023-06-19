package SKK_Day03;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double price, tot;
		int qty = 0;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input the quantity to purchase : ");
		qty = kb.nextInt();
		System.out.println("What is the price of the item ? ");
		price = kb.nextDouble();

		tot = price * qty;

		if (qty > 100) {
			tot *= 0.9;
		}

		System.out.printf("Total price is : %.2f CAD %n", tot);

		kb.close();

	}

}
