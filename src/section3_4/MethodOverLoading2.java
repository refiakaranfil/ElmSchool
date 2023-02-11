package section3_4;

public class MethodOverLoading2 {
	
	public static void main(String[] args) {	
		
		System.out.println(avarageOfNumbers(3, 8, 7));
		System.out.println(avarageOfNumbers(3.6, 8.2, 7.8));
	}
	
	public static int avarageOfNumbers (int a, int b, int c) {
		
		int avarage = ((a + b + c) / 3);
		return avarage;
	}
	
	public static double avarageOfNumbers (double a, double b, double c) {
		
	    double avarage = ((a + b + c) / 3);
		return avarage;
		// return avarageOfNumbers ( avarageOfNumbers(a, b), c);

}
}