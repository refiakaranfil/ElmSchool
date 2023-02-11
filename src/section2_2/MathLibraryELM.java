package section2_2;

import java.util.Scanner;

public class MathLibraryELM {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter first number");	
	int number1 = scan.nextInt();
	
	System.out.println("Enter second number");	
	int number2 = scan.nextInt();
	
	int greatest = Math.max(number1, number2);	
	System.out.println("The greatest number is: "+greatest);
	
	int smallest = Math.min(number1, number2);	
	System.out.println("Smallest number is: " + smallest);
	
	double toThePower = Math.pow(greatest, smallest);	
	System.out.println(greatest + "to the power of " + smallest + "is: " + toThePower);
	
	double sqrt = Math.sqrt(toThePower);	
	System.out.println("Square root of " + toThePower + " is: " + sqrt);
	

	System.out.println(Math.sqrt(Math.pow(Math.max(number1,  number2), Math.min(number1, number2))));
	
	double numbera = 28;    
    double numberb = 4;
    
    System.out.println("Logarithm of number1 is: " + Math.log(numbera));   
    System.out.println("Logarithm of number2 is: " + Math.log(numberb));
	
	
	
	
	
	
	
	
	

}
}