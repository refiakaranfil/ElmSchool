package section3_2;

public class Recap2 {
	
	public static void main(String[] args) {
		
		isVowelOrConsonant('w');
		
	}
	
	public static void apple () {
		
		String str = "apple"; //str.charAt(?);
		
		System.out.println(str.charAt(0) +""+ str.charAt(2) +""+ str.charAt(4));
	}

	public static void isVowelOrConsonant(char letter) {
		
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			
			System.out.println( letter + " is vowel.");
			
		} else {
			
			System.out.println( letter + " is consonant.");
			
		}
		
//		switch(letter) {
//		
//		case 'a' :
//		case 'e' :
//		case 'i' :
//		case 'o' :
//		case 'u' :
//			System.out.println(letter + " is vowel.");
//			break;
//		default:
//			System.out.println(letter + " is consonant.");
		}
		
	public static void timer() {
		
		
	}
}
