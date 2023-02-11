package section6_2;

import java.util.Arrays;

public class A623_MyStringMethods1_5 {
	
	public static void main(String[] args) {
		
		
		System.out.println(reverseTheString("refia"));
		System.out.println(isPalindrome("java"));
		System.out.println(areAnagrams("stop", "pots"));
	}
	
	//public static boolean hasCorrectParenthesis (String str) {
		
	//}
	
	public static String reverseTheString(String str) {
		
		String reverse = "";
		
		for (int i = str.length() - 1; i >= 0; i-- ) {
			reverse += str.charAt(i); 
		}
		return reverse;
	}
	
	public static boolean isPalindrome(String str) {
		
		String reverse = "";
		
		for (int i = str.length()-1; i >=0; i-- ) {
			reverse += str.charAt(i);
	    }
		return reverse.equals(str);	
	}
	
	public static boolean areAnagrams(String str1, String str2) {
		
		char [] char1 = str1.toCharArray();
		char [] char2 = str2.toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		return Arrays.equals(char1, char2);
		 
    }  
		
		
	
}
