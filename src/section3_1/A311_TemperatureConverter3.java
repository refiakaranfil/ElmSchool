package section3_1;

import java.util.Scanner;

public class A311_TemperatureConverter3 {
	
	public static void main(String[] args) {
		
		celciusFahrenheit();
	}

	public static void celciusFahrenheit() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the degree: ");
		
		int degree = scan.nextInt();
		
		System.out.print("Please enter the scale ( C for Celcius or F for Fahrenheit): ");
		
		char scale = scan.next().charAt(0);
		
		if (scale == 'C') {	
			
			int fahrenheit = degree * 9 / 5 + 32;
			
			System.out.print( degree + " degrees Celcius is equal to " + fahrenheit + " degrees Fahrenheit" );
			
		} else if (scale == 'F') {
			
			int celcius = (degree - 32) * 5 / 9;
			
			System.out.print( degree + " degrees Fahrenheit is equal to " + celcius + " degrees Celcius" );
			
		}		
		
	}
	
}
