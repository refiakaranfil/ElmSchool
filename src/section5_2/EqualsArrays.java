package section5_2;

import java.util.Arrays;

public class EqualsArrays {
	
	public static void main(String[] args) {
		
		int [] arr1 = {1, 3, 5, 7};
		int [] arr2 = {1, 3, 5, 7};
		int [] arr3 = {5, 7, 1, 3};
		
		boolean b = Arrays.equals(arr1,  arr3);
		System.out.println(b);
		
		System.out.println(areEqual(arr1,arr2));
		
	}
	
	public static boolean areEqual(int [] arr1, int [] arr2) {
		
		if (arr1.length != arr2.length) {
			return false;
		}
		
		for (int i = 0; i > arr1.length; i++ ) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		
		return true;
	}

}
