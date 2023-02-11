package section4_1;

public class MultiplicationTableDemo {
	
	public static void main(String[] args) {
		
		multiplicationLine(1);
		multiplicationLine(2);
		multiplicationLine(3);
		multiplicationLine(4);
		multiplicationLine(5);
	}
	
	public static void multiplicationLine(int number) {
		
		int multiplier = 1;
		
		while (multiplier <= 10) {
			
			int result = number * multiplier;
			
			System.out.print(result + " ");
			
			multiplier ++;
		}
		System.out.println();
	}

}
