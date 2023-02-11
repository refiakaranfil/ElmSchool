package section5_2;

public class ArrayManipulation {
	
	public static void main(String[] args) {
		
		int[] a = {3, 10, 15, -9};
		int target = 0;
		int result = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]== target) {
				result = 1;	
			break;	
			} else {
				result = -1;
			}
			
		} System.out.println(result);
	}

}