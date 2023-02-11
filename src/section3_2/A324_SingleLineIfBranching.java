package section3_2;

public class A324_SingleLineIfBranching {
	
	public static void main(String[] args) {
		
		String sign;
		int number = 5;
		boolean isEven = (number % 2 == 0 );
		
		sign = (number>0) ? "positive" : (number==0) ? "zero" : "negative";
		
		
		System.out.println(sign);
		System.out.println(isEven);
		
	}

}
