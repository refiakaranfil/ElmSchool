package section2_3;

public class MethodWithMultParam {
	
	public static void main(String[] args) {
		
		int a = 15;
	    int b = 3;
	    printDivisionResult (a , b);
	    
	    
	   int max = Math.max(15, 10);
	   smartPrint("Max value is: " , max);
	    
		
	}
	public static void smartPrint(String str, int num) {
		
		System.out.println(str + num);
	}
	
	
	public static void printDivisionResult (int num1, int num2) {
		
		int result = num1 / num2;
		System.out.println("Division result is: " + result);
		
	}
}
