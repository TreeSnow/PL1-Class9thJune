package SKK_Day03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double usedUnit, rate1 = 0.5, rate2 = 0.75, rate3 = 1.2, rate4 = 1.5, totCharge;

		Scanner kb = new Scanner(System.in);
		System.out.print("How much unit of electicity was used ?");
		usedUnit = kb.nextDouble();

		if (usedUnit <= 50) {
			totCharge = usedUnit * rate1;
		} else if (usedUnit <= 150) {
			totCharge = (50 * rate1) + ((usedUnit - 50) * rate2);
		} else if (usedUnit <= 250) {
			totCharge = (50 * rate1) + (100 * rate2) + ((usedUnit - 150) * rate3);
		} else {
			totCharge = (50 * rate1) + (100 * rate2) + (100 * rate3) + ((usedUnit - 250) * rate4 * 1.2);
		}

		System.out.printf("[ Electricity bill ] %n- Total : %.2f CAD %n ", totCharge);

		kb.close();
	}

}
