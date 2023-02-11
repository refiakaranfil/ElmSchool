package section7_1;

import java.util.Arrays;

public class Refia {
	
	public static void main (String[] args) {
	
	String [] names = {"Fuad", "Sahin", "Refia"};
	
	String str = Arrays.toString(names);
	System.out.println(str);
	
	System.out.println(Arrays.toString(names));
	System.out.println(Arrays.deepToString(names));
	
	String [] [] fullNames = {
			{"Gadimov","Karanfil"},
			names,
			names
	};
	
	System.out.println(Arrays.toString(fullNames));
	System.out.println(Arrays.deepToString(fullNames));
	
	int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	int [] copy = Arrays.copyOf(numbers, 12);
	
	System.out.println(Arrays.toString(copy));
	
	int [] nums = new int [5];
	nums[0] = 2;
	
	
	
	}	


}
