package SKK_Day03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int monthNum;
		String monthName = "";
		Scanner kb = new Scanner(System.in);
		System.out.println("Give me number of any month");
		monthNum = kb.nextInt();

		switch (monthNum) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		default:
			break;

		}

		if (monthNum > 12 || monthNum < 1) {
			monthName = "There is no month having that number!!";
			System.out.println(monthName);
		} else {
			System.out.println("You entered " + monthName);
		}

		kb.close();

	}

}
