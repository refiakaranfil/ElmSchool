package section4_2;

public class PrintStars {
	
public static void main(String[] args ) {
	
	int counter = 3;
	while (counter > 0) {
		printStar(6);
		System.out.println();
		counter--;
	}	
}
	public static void printStar(int number) {
							
		int counter = 1;		
		while (counter <= number) {
			System.out.print("*");
			counter ++;		
	}
  }
}