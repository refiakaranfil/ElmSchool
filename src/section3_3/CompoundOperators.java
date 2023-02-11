package section3_3;

public class CompoundOperators {
	
public static void main(String[] args) {
		
		int num = 10;
		System.out.println("Previous: " + num);
		
		num += 5; // => (number = number + 1) num += 5;
		System.out.println("Current: "+ num);
		
		num -=2;
		System.out.println(num);
		
		num *=2;  // => num = num * 2;
		System.out.println(num);
		
		num /=2;
		System.out.println(num);
		
		
		num %=5; // => 13 % 5 = 3 
		System.out.println(num);
	}

}
