package section6_2;

public class ReplaceFirst {
	
	public static void main(String[] args) {
		
		String str = "ELM School";
		String str2 = "Hello world. I love this world.";
		str = str.replace('o', '0');
		System.out.println(str);
		
		str2 = str2.replaceFirst("world", "love" );
		System.out.println(str2);
		
	}

}
