package section3_2;

import java.util.Scanner;

public class A322_ExamMachine {
	
	public static void main(String[] args) {
	
	System.out.println("Which of the following is NOT a conditional operator:");
	System.out.println("a. &&");
	System.out.println("b. |");
	System.out.println("c. !");
	System.out.println("d. ==");
	
	Scanner scan = new Scanner(System.in);
	
	String choice = scan.nextLine();
	String result = "";
	
	switch (choice) {
	case "a":
	case "b":
	case "c": result = "Invalid choice."; break;
	case "d": result = "Congratulations!"; break;
	default: result = "Bad choice"; break;
	}
	
	System.out.println(result);
	
//	System.out.println("Which of the following is NOT a conditional operator:\n"
//			+ "a. && \n"
//			+ "b. | \n"
//			+ "c. ! \n"
//			+ "d. ==");
}
}