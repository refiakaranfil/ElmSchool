package section4_3;

public class WarmUp1 {
	
	public static void main(String[] args) {
		
		// 152   251
		int reversed = 0;
		int number = 152;
		
		int digit1 = number % 10; //2
		reversed = (reversed + digit1) * 10; //20
		number /=10; //15
		int digit2 = number % 10; //5
		reversed = (reversed + digit2) * 10; //250
		int digit3 = number /10; //1
		reversed = reversed + digit3; //251
		
		System.out.println(reversed);
		
	}

}
