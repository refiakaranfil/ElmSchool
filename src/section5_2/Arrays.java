package section5_2;

public class Arrays {

	public static void main(String[] args) {
		
		double [] arr = {3.0, 4.0, 5.0};
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = Math.pow(arr[i], 2.0);
	 //a[0],a[1],a[2]	
			System.out.println(arr[i]);
		//	System.out.println(Arrays.toString(arr));		
		}
		
		double target1 = 4.0;
		double [] arr2 = {3.0, 4.0, 5.0};
			System.out.println(search(arr2,target1));
		
		double [] arr3 = {3.0, 4.0, 5.0};	
			System.out.println(sum(arr3));
	}
	
	public static int search (double[] arr, double target) {
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == target) {
				
				return i;
			}
		}
		return -1;
	}
	
	public static double sum(double[] arr) {     // accept a double array
	    double total = 0.0;                      // declare and initialize a value of 'total' to 0

	    for (int i = 0; i < arr.length; i++) {   // traverse through the array
	        total += arr[i];                     // sum and assign the current array element's value to 'total'
	    }

	    return total;                            // return the final value of total, after the traversal is complete
	}
}
