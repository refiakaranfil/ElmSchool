package section3_2;

public class TernaryDemo {
	
	public static void main(String[] args) {
		
		ifDemo(1);
		ternaryDemo(1);
	}
	
	public static void ternaryDemo(int num) {
		String message = (num % 2 == 0) ? "This number is even" : "This number is odd";
		System.out.println(message);
	}
	
	public static void ifDemo(int num) {
		
		String message;
		if (num % 2 == 0) {
			message = "This number is even";
		} else {
			message = "This number is odd";
		}
		System.out.println(message);
	}

}
