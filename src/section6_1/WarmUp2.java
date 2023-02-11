package section6_1;

public class WarmUp2 {
	
	public static void main(String[] args) {
		
		String str = "asdfdogcatdogcatdcat";
		int dogCount = 0;
	
		
		while(str.contains("dog")) {
			
			str = str.replaceFirst("dog", "");
			dogCount++;
			
		}
		System.out.println(dogCount);
	}

}
