package section6_1;

public class Substring {
	
	public static void main(String[] args) {
		
		String s = "hello";  
		System.out.println( s.substring( 0, 2 ) );  // display the substring of 's', start at index 0 and end at 2
		
		String fruit = "banana";

		System.out.println( fruit.substring( 0 ) ); // display substring of 'fruit' that starts at index 0
		System.out.println( fruit.substring( 2 ) ); // display substring of 'fruit' that starts at index 2
		System.out.println( fruit.substring( 6 ) ); // display substring of 'fruit' that starts at index 6
		
		System.out.println( fruit.substring( 0, 3 ) ); // display substring of 'fruit' that starts at index 0, ends at 3
		System.out.println( fruit.substring( 2, 5 ) ); // display substring of 'fruit' that starts at index 2, ends at 5
		System.out.println( fruit.substring( 6, 6 ) ); // display substring of 'fruit' that starts at index 6, ends at 6
		int a = 10;
		int b = 20;
		boolean result = a>b && a++>b++;
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);
	
	}
}
