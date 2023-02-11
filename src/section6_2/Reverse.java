package section6_2;

public class Reverse {
	
	public static void main(String[] args) {
		
		String fruit = "banana";
		String a = "";
		
		for (int i = fruit.length()-1; i >= 0 ; i--) {
			a = a + fruit.charAt(i);
		}
		
		System.out.println(a);
		
		
		String fruit2 = "apple";
		for (int k = fruit2.length()-1; k >= 0 ; k--) {
		
			System.out.print(fruit2.charAt(k));
		}
		
		System.out.println("");
		
		
		String str = "java";
		String reversed = "";
		
		for (int j = str.length()-1; j >= 0; j--) {
			System.out.println(str.charAt(j));
	        reversed += str.charAt(j);
	    }
	            System.out.println(reversed);
	}
				
}