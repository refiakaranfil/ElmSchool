package section3_2;

import java.util.Scanner;

public class A321_NumberDetector {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Press a number key: ");
	
		int number = scan.nextInt();
		String result = "";

	switch (number) {
	case 0: result = "You pressed zero."; break;
	case 1: result = "You pressed one."; break;
	case 2: result = "You pressed two."; break;
	case 3: result = "You pressed three."; break;
	case 4: result = "You pressed four."; break;
	case 5: result = "You pressed five."; break;
	case 6: result = "You pressed six."; break;
	case 7: result = "You pressed seven."; break;
	case 8: result = "You pressed eight."; break;
	case 9: result = "You pressed nine."; break;
	case 10: result = "You pressed ten."; break;
	default: result = "Not allowed.";break;
}	
	System.out.println(result);
	}
}
