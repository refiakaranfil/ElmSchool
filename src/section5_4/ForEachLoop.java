package section5_4;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		int [] a = {1, 3, 5, 7};
		
			for (int i = 0; i < a.length; i++) {
			
				System.out.println(a[i]);
			}
		
			for (int value : a) {
			
				System.out.println(value);
			}
		
		String [] citiesOfTurkey = {"Istanbul", "Izmir", "Giresun", "Manisa"};
		
			for (String city : citiesOfTurkey) {
			
				System.out.println(city);
			}
		
		int numbers [][] = {
				{1, 2, 3},
				{6, 12, 15, 2},
				{11, 13, 8}
				};
		int sum = 0;
		
			for (int [] nums : numbers) {
			
				for (int i = 0; i < nums.length; i++) {
				
					if (nums[i] % 2 == 0) {
					
						sum += nums[i];
					}
				}
			}
			System.out.println(sum);
	}

}
