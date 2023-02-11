package section5_2;

import java.util.Arrays;

public class ArraysToString {
	
	public static void main(String[] args) {
		
		int [] a = {1, 3, 6, 21};
		
		System.out.println(customToString(a));
		System.out.println(Arrays.toString(a));
		
		
	}
	// this method converts int [] into String
	public static String customToString(int [] arr) {
		
		String str = "";
		
		str += "[";
		
		for (int i = 0; i < arr.length; i++) {
			
			if (i == arr.length-1) {
				
				str += arr[i] + "]";
				break;
			}
			str+= arr[i] + ",  ";
		}
		return str;
		
	}

}
