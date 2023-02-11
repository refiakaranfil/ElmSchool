package section6_1;

public class WarmUp3 {
	
public static void main(String[] args) {
	
	// how many dogs and cats are in given String?
	String str = "asdfdogcatdogcatdcatcatdogcat";
		int dogCount = 0;
		int catCount= 0;

	
		while(str.contains("dog") || str.contains("cat")) {
			if  (str.contains("dog")) {
				str = str.replaceFirst("dog", "");
				dogCount++;
			}
			if (str.contains("cat"))
				str = str.replaceFirst("cat", "");
			catCount++;
	
		
		}
		System.out.println(dogCount);
		System.out.println(catCount);

}

}