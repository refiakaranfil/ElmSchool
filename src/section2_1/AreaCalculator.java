package section2_1;

import java.util.Scanner;

public class AreaCalculator {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
							
		
		System.out.print("Width:");
		double width = scan.nextDouble();
					
		
		System.out.print("Height:");
		double height = scan.nextDouble();
			
		
		System.out.println("Area: " + width * height );
		
		System.out.print("Perimeter" + (width + height) * 2 );
	
	
}

}
