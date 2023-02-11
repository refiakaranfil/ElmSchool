package section2_1;

import java.util.Scanner;

public class PersonalIdentity {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please type your name: ");
		String name = input.nextLine();
		
		System.out.print("Please enter your gender (M or F)");
		char gender = input.next().charAt(0);
		
		System.out.print("Please enter your age: ");
		int age = input.nextInt();
		
		System.out.print("Please enter your (phone number (numbers only):");
		long phoneNumber = input.nextLong();
		
		input.nextLine();
		
		System.out.print("Please type your school name: ");
		String schoolname = input.nextLine();
		
		System.out.print("Please enter your most recent GPA: ");
		double gpa = input.nextDouble();
		
		System.out.println("Name:" + name);
		System.out.println("Gender:" + gender);
		System.out.println("Age:" + age);
		System.out.println("Phone Number:" + phoneNumber);
		System.out.println("School Name:" + schoolname);
		System.out.println("GPA:" + gpa);
		
		
	}
	

}
