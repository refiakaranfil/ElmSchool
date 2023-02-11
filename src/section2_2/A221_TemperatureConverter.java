package section2_2;

import java.util.Scanner;

public class A221_TemperatureConverter {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Fahrenheit: ");
						
		double fahrenheit = scan.nextDouble();
		
		double celcius = Math.round(fahrenheit - 32) * 5 / 9;
		
		System.out.print( celcius + " C degrees" );
	}
}
	
