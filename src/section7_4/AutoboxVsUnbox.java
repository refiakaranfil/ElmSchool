package section7_4;

import java.util.*;  //wildcard

public class AutoboxVsUnbox {
	
	public static void main(String[] args) {
		
		// // Student s = new Student();
		// Autoboxing
		// autoboxing (automatically putting something in a 'box')
		// int i = 10;
		// Integer num = i;
		
		// Unboxing
		// unboxing (automatically take out something from a 'box')
		// i = num;
			
		//Question:
		/*
		 * Given String sh3hd4tytrrt5
		 * calculate sum of numbers
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter your input: ");		
		String str = scan.next();
		
		System.out.println(returnSum(str));
		System.out.println(returnSum2(str));
			
	}
	
	public static int returnSum(String str) {
		// Character.isDigit(char c);
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch)) {
				
				sum += Integer.valueOf("" + ch);
			}
		}
		return sum;
	}
	
	public static int returnSum2(String str) {
		
		//Character.isDigit(char c);
		int sum = 0;    //[a, p, p, l, l, e]
		
		for (char ch : str.toCharArray()) {
			
			if(Character.isDigit(ch)) {
				
				sum+=Integer.valueOf(""+ch);
			}
		}
		return sum;
	}
	
	

}
