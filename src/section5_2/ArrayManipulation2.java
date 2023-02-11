package section5_2;

public class ArrayManipulation2 {
	
	public static void main(String[] args) {
		
		int[] a = {3, 10, 15, -9};
		
		System.out.println(search(a,10));
		
	}
	
	public static int search(int [] a, int target) {
	
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]== target) {
				
				return 1;	
			}			
		} 
		
		return -1;
	}

}
