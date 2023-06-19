package SKK_Day03;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pen1 = 50, pen2 = 1, pen3 =5, over, penalty;

		Scanner kb = new Scanner(System.in);
		System.out.println("How many days have been passed since the due date ? ");
		over = kb.nextInt();
		

		if (over <= 5) {
			penalty = 1;
		}else if (over <=10) {
			penalty = 2;
		}else if (over <=30) {
			penalty = 3;
		}else {
			penalty = 4;
		}
		
		switch(penalty) {
		case 1:
			System.out.printf("Your return is late %d Days. You must pay %d paise %n", over, pen1);		
			break;
		case 2:
			System.out.printf("Your return is late %d Days. You must pay %d Rs. %n", over, pen2);		
			break;
		case 3:
			System.out.printf("Your return is late %d Days. You must pay %d Rs. %n", over, pen3);		
			break;
		case 4:
			System.out.println("Your return is late more than 30 Days. Your membership is cancelled !!");		
			break;
		default :
			System.out.println("");
			break;
		}
		

		kb.close();
	}

}
