package SKK_Day03;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12345, cnt =0, temp;
		
		temp = num;
		num = Math.abs(num);
		
		while(num !=0) {
			num /=10;
			cnt++;
		}
		
		System.out.printf("The digit of given number %d is %d !! %n ", temp, cnt);
		

	}

}
