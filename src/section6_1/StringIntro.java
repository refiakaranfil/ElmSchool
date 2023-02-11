package section6_1;

public class StringIntro {
	
	public static void main(String[] args) {
		
		String str = "java";
		
		String str2 = new String (str);
		
		System.out.println(str);
		System.out.println(str2);
		
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
	}

}
