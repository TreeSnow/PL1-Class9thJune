package SKK_Day03;

public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length=5, breadth=4, area, perim;
		
		perim = (length + breadth) *2;
		area = length * breadth;
		
		if (area > perim) {
			System.out.println("[ Condition ] : Area > Perimeter  ");
			System.out.printf(" # Area : %d %n # Perimeter : %d %n ", area, perim);
			System.out.println("This rectangle meets the condition!!");
		}else {
			System.out.println("[ Condition ] : Area > Perimeter  ");
			System.out.printf(" # Area : %d %n # Perimeter : %d %n ", area, perim);
			System.out.println("This rectangle does not meet the condition!!");	
		}
		
		
	}

}
