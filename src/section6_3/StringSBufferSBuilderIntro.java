package section6_3;

public class StringSBufferSBuilderIntro {
	
	public static void main(String[] args) {
		
		/*
		 * 1.String: (Immutable), concat(), + , overrides equals()
		 * 2.StringBuffer: (Mutable), (Faster), append(), Synchronized
		 *   it does NOT have an access to the String constant pool
		 *   when creating StringBuffer objects,
		 *   we are simply creating objects that are stored in the Heap memory. 
		 * 3.StringBuilder: (non-Synchronized)
		 */
		
		//String concat (10000 times) execution time - 317ms
		//StringBuffer concat (10000 times) execution time - 1ms
		
		//String concat (10000 times) execution time -?ms
		//StringBuffer concat (10000 times) execution time - 5ms
		//StringBuilder concat (10000 times) execution time - 5ms
		
		long startTime = System.currentTimeMillis();
		concatWithString();
		concatWithStringBuffer();
		concatWithStringBuilder();
		
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println(executionTime);
	}
	
	public static String concatWithString() {
		
		String str = "ELM School";
		
		for (int i = 0; i < 10000; i++) {
			
			str = str + " is the best";
		}
		return str;
	}
	
	public static String concatWithStringBuffer() {
		
		StringBuffer sbf = new StringBuffer("ELM School");
		
		for (int i = 0; i < 10000; i++) {
			
			sbf.append(" is the best");
		}
		return sbf.toString();
	}
	
	public static String concatWithStringBuilder() {
		
		StringBuffer sbf = new StringBuffer("ELM School");
		
		for (int i = 0; i < 10000; i++) {
			
			sbf.append(" is the best");
		}
		return sbf.toString();
	}

}
