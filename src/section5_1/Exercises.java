package section5_1;

public class Exercises {
	
	public static void main(String[] args) {
		
		double [] nums = {1, 5, 10, -3};
		
		//double sum = nums[0] + nums[1] + nums[2] + nums [3];
		
		//Create method which calculates sum of double array.
		//And we don't know what is going to be the size of array
		//return the sum
		System.out.println(sumOfArray(nums));
		
		
	}
	
	public static double sumOfArray(double [] arr) {
		
		double sum = 0;
		//{1, 5, 10, -3}
		for (int i =0; i < arr.length; i++ ) {
			
			sum += arr[i];  //1 + 5 + 10 + -3
		}
		
		return sum;
	}

}