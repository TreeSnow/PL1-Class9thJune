package SKK_Day03;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		int age1 = 0, age2 = 0, age3 = 0, young, check=0;

		System.out.println("Input the age of Ram : ");
		age1 = kb.nextInt();
		System.out.println("Input the age of Shyam : ");
		age2 = kb.nextInt();
		System.out.println("Input the age of Ajay : ");
		age3 = kb.nextInt();

		if (age1 < age2) {
			if (age2 < age3) {
				young = age1;
				check = 1;
			}else if(age1 < age3) {
				young = age1;
				check = 1;			
				
			}else {
				young = age3;
				check = 3;
			}

		} else if (age2 > age3) {
			young = age3;
			check = 3;
		} else {
			young = age2;
			check = 2;
		}

		
		switch (check) {
		case 1:
			System.out.println("Youngest one is Ram !");
			break;
		case 2:
			System.out.println("Youngest one is Shyam !");
			break;
		case 3:
			System.out.println("Youngest one is Ajay !");
			break;

		}

		kb.close();
	}

}
