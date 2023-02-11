package section7_4;

public class WrappersInAction2 {
	
	public static void main(String[] args) {
		
		// MAX_VALUE
		// MIN_VALUE
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		System.out.println("Max Value: " + max);
		System.out.println("Min Value: " + min);
		
		// valueOf, parseInteger, parseShort
		String a = "512";
		int num = Integer.parseInt(a);    // double num = Integer.parseInt(a);
		System.out.println(num + " This number is converted to String");
		
		// min()
		// max()
		System.out.println(Integer.max(5, 9));
		
		// isAlphabetic()
		// isDigit()
		char ch = 'e';       // char ch = '6';  returns false       //  char ch = '#';  returns true with isDigit()
		boolean b = Character.isAlphabetic(ch);
		System.out.println(b);
		
		// valueOf()
		// parseBoolean()
		boolean bool = Boolean.valueOf("rdthtr");    // try Boolean.valueOf("true");  and  Boolean.valueOf("false");
		System.out.println(bool);
		
	}

}
