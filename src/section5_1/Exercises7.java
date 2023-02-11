package section5_1;

public class Exercises7 {
	
	public static void main(String[] args) {
		
		int t = 6;
		int [] nums = {2,3,4};
		
		System.out.println(isThere(nums,t));
	}		
		
		public static boolean isThere(int [] arr, int target) {
			
			for (int i = 0; i<arr.length; i++) {
				
				for (int a = 0; a < arr.length; a++) {
					
					if(arr[i] + arr[a] == target && i!=a) {
						
						return true;
					}					
				}				
			}
			return false;
				
	}

}
