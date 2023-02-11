package section6_2;

public class A621_MyStringMethods {
	
	public static void main(String[] args) {
		
		System.out.println(isEmpty(""));		
		String [] str2 = {"izmir", "istanbul", "mugla"};		
		String [] str3 = {"izmir", "istanbul", "mugla"};
		boolean [] str4 = {true, false, true};
		int [] str6 = {3, 8, 4, 5};
		double [] str7 = {2.6, 5.9};
		System.out.println(lengthAll(str2));
		System.out.println(joinAll(str3));
		System.out.println(joinAll(str4));
		System.out.println(joinAll("hello".toCharArray()));
		System.out.println(joinAll(str6));
		System.out.println(joinAll(str7));
		
		
		
	}
	
	public static boolean isEmpty (String str) {
		
		if (str.length() < 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int lengthAll (String [] str2) {
		
		int sum = 0;
				
		for (int i = 0; i < str2.length; i++) {        // for (String a : str2) {
													
			sum = sum + str2[i].length();			  //  sum = sum + a.length();				
		} 
		return sum;
	}
	
	public static String joinAll (String [] str3) {
		
		String str = "";
														// String result = "";
		for (int i = 0; i < str3.length; i++) { 		// for (String word : str3) {
														//     result = result + word + ", ";
			if ( i == str3.length-1) {					// }
														// result = result.substring(0, result.length()-2);
				str += str3[i];							// return result;
				break;
			}
			str += str3[i] + ", ";
		}
		return str;
		
	}
	
	public static String joinAll (boolean [] str4) {
		
		String result = "";
	    for (boolean word : str4) {
           result = result + word + ", ";
	    }
		result = result.substring(0, result.length()-2);
		return result;
		
	}
	
	public static String joinAll (char [] str5) {
		
		String result = "";
	    for (char word : str5) {
           result = result + word + ", ";
	    }
		result = result.substring(0, result.length()-2);
		return result;
		
	}
	
	public static String joinAll (int [] str6) {
		
		String result = "";
	    for (int word : str6) {
           result = result + word + ", ";
	    }
		result = result.substring(0, result.length()-2);
		return result;
		
	}

	public static String joinAll (double [] str7) {
	
		String result = "";
	    for (double word : str7) {
	       result = result + word + ", ";
	    }
		result = result.substring(0, result.length()-2);
		return result;
	
}

}
