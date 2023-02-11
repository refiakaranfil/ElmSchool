package section3_2;

public class Recap {
	
	public static void main(String[] args) {
		
		Money(15000);
	}

	public static void isEvenAndLessThan50(int num) {
		
		if(num<50 && num%2 == 0) {
			
			System.out.println("true");	
			
	    } else {
	    	
			System.out.println("Wrong input");	
		}
	}
	
	public static void Money(int money) {
		
//		String answer= ( money>10000 )? "yes": "no";
		
//		System.out.println(answer);
		
		boolean answer = (money>10000);
		System.out.println(answer);
		
		if (answer) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
