package section3_2;

public class NestedTernary {
	
	public static void main(String[] args) {
		
		ifDemo(6);
		ternaryDemo(6);
		int num = 1;
		String m = (num == 1) ? "true" : "false";
		boolean isOne = (num == 1);
		
	}
	
	public static void ternaryDemo(int num) {
		
		String message = (num > 0) ? "positive" 
				: ((num == 0)) ? "zero" 
						: "negative";
		
		if (num > 0) {
			message = "positive";
		} else {
			if (num == 0) {
				message = "zero";
			} else {
				message = "negative";
			}
		}
		System.out.println(message);
	}
	
	public static void ifDemo(int num) {
		
		String message;
		
		if (num > 0) {
			message = "positive";
		} else {
			if (num == 0) {
				message = "zero";
			} else {
				message = "negative";
			}
		}
		System.out.println(message);
	}

}
