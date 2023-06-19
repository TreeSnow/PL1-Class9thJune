package SKK_Day03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double amount, amountTemp, note100, note50, note20, note10, note5, coinD2, coinD1;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input the amount of money to count : ");
		amount = kb.nextDouble();
		amountTemp = amount;

		note100 = (amountTemp - amountTemp % 100) / 100;
		amountTemp = amount % 100;

		note50 = (amountTemp - amountTemp % 50) / 50;
		amountTemp %= 50;

		note20 = (amountTemp - amountTemp % 20) / 20;
		amountTemp %= 20;

		note10 = (amountTemp - amountTemp % 10) / 10;
		amountTemp %= 10;

		note5 = (amountTemp - amountTemp % 5) / 5;
		amountTemp %= 5;

		coinD2 = (amountTemp - amountTemp % 2) / 2;
		amountTemp %= 2;

		coinD1 = amountTemp;

		NumberFormat currency = NumberFormat.getCurrencyInstance(); // format currency 
		DecimalFormat x = new DecimalFormat("#,###"); // format number of notes, coins

		System.out.println("The amount CAD " + currency.format(amount) + " has");
		System.out.println("================================");

		System.out.printf("Note 100 CAD : %s %n", x.format(note100));
		System.out.printf("Note 50 CAD : %s %n", x.format(note50));
		System.out.printf("Note 20 CAD : %s %n", x.format(note20));
		System.out.printf("Note 10 CAD : %s %n", x.format(note10));
		System.out.printf("Note 5 CAD : %s %n", x.format(note5));
		System.out.printf("Coin 2 CAD : %s %n", x.format(coinD2));
		System.out.printf("Coin 1 CAD : %s %n", x.format(coinD1));

		kb.close();

	}

}
