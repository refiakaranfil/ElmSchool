package section5_1;

import java.util.Arrays;

public class ArraysWarmUp {
	
	public static void main(String[] args) {
		
		int a [] = new int [10];
		
		for (int i = 0 , k = 0 ; i < a.length ; i++ , k+=2) {
			
			// i 0, 1, 2, 3, 4 (indexes)
			// k 0, 2, 4, 6, 8 (values to pass)	
			a[i] = k;
		}
		
	//	int idx = 0;
	//	int value = 0;
		
	//	while (idx < a.length) {
			
	//		a[idx] = value;
	//		idx++;
	//		value+=2;
			
	//	}
		
		System.out.println(Arrays.toString(a));
		
		for (int index = 0; index < a.length; index++) {
			
			a[index]++;
			
		}
		
		System.out.println(Arrays.toString(a));	
	}

}
