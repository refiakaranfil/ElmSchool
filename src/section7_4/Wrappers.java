package section7_4;

public class Wrappers {
	
	public static void main(String[] args) {
		
		String str = "java";  // object
		int i = 5;            // primitive
		
		// to givw object apperances to primitives
		
		Byte b = 1;
		Short s = 10;
		Integer num = 5;
		Long l = 1000l;
		Float f = 7635287.324f;
		Double d = 11.5;
		Boolean bool = true;
		Character ch = 'a';
		
		
		String startYear = "2023";   //2025
		int year = Integer.parseInt(startYear);
		String endYear = "" + (year + 2);
		System.out.println(endYear);
	}

}
