package section5_2;

import java.util.Arrays;

public class FindTheDifference {
	
	public static void main (String [] args) {
		
		int [] nums = {4, 12, 3, 61, 17, -9};
		System.out.println(findtheDifference(nums));
		
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		int diff = nums[nums.length-1] - nums[0];
		System.out.println(diff);
	}
	
	public static int findtheDifference(int [] nums) {
		
		int largest = nums[0];
		int smallest = nums[0];
		int idx = 0;
		
		while (idx < nums.length) {
			
			if (nums[idx] > largest) {
				largest = nums[idx];
			}
			
			if (nums[idx] < smallest) {
				smallest = nums[idx];
			}
			idx++;
		}
		return largest - smallest;
	}

}
