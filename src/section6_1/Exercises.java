package section6_1;

import java.util.Arrays;

public class Exercises {
	
	public static void main(String[] args) {
		
		// write a code to find first repeated char
		String str = "hello";
		for (int i = 0; i < str.length(); i++)
			
			if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
				
				System.out.println(str.charAt(i));
				break;
			}				
		//Write a code to find first repeated char
				//toCharArray("hello") - [h,e,l,l,o]  
			
				String sentence = "I love java";
				//find how many words are in this sentence?
				String [] strs = sentence.split(" ");
				System.out.println(strs.length);				
			}
			//[s,i,l,e,n,t] 
			//toCharArray("hello") - [h,e,l,l,o]  
			//char [] chars= str.toCharArray();
	
	public static boolean isAnagram(String str1, String str2) {
				
		char [] chars1 = str1.toCharArray();
		char [] chars2 = str2.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		return Arrays.equals(chars1, chars2);
				
	}

}