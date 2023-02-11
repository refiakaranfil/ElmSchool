package section3_4;

public class WarmUp {
	
	public static void main(String[] args) {
		
		System.out.println(abs(-3));
		System.out.println(abs(-2.6));
		
	}

	public static int abs(int a) {
		int result;
		if (a<0) {
			result = a * -1;
		} else {
			result = a;
		}
		return result;
		
		// return a < 0 ? a * -1 : a;
	}
	
	public static double abs(double a) {
		
		double result;
		if (a<0) {
			result = a * -1;
		} else {
			result = a;
		}
		return result;
		
		// return a < 0 ? a * -1 : a;
	}
}
