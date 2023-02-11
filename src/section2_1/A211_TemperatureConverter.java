package section2_1;

import java.util.Scanner;

public class A211_TemperatureConverter {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Celcius: ");
						
		double celcius = scan.nextDouble();
		
		double fahrenheit = celcius * 9 / 5.0 + 32;
		
		System.out.print( fahrenheit + " F degrees" );
		
		
	}

}
