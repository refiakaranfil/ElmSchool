package section9_2;

import java.util.ArrayList;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		
       ArrayList<Integer> numbers1 = new ArrayList<>();
		numbers1.add(10);
		numbers1.add(5);
		numbers1.add(78);
		numbers1.add(9);
		numbers1.add(-1);
		numbers1.add(0);
		
		System.out.println(secondLargest(numbers1));
		
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
		numbers2.add(10);
		numbers2.add(81);
		numbers2.add(3);
		numbers2.add(9);
		numbers2.add(-11);
		numbers2.add(50);
	 	
		System.out.println(retrunCommons(numbers1, numbers2));
		
		
		ArrayList<Integer> numbers3 = new ArrayList<>();
		numbers3.add(10);
		numbers3.add(81);
		numbers3.add(3);
		numbers3.add(9);
		numbers3.add(10);
		numbers3.add(3);
		
		System.out.println(removeDuplicates(numbers3));
	}
			
		public static int secondLargest(ArrayList<Integer> numbers) {
			
			int largest1 = Integer.MIN_VALUE; // 78
			int largest2 = Integer.MIN_VALUE; // 10

			for (int num : numbers) {
				//  0    >   78
				if (num > largest1) {
					
					largest2 = largest1;
					largest1 = num;
					//    0    10          	5		10
				}else if(num > largest2 && num != largest1 ) {
					
					largest2 = num;
				}						
			}			
			return largest2;
		}
		
		public static ArrayList<Integer> retrunCommons(ArrayList<Integer> numbers1, ArrayList<Integer> numbers2 ) {
			
			ArrayList <Integer> commons = new ArrayList<>(); 
			for (int i =0; i < numbers1.size(); i++) {
				
				if (numbers2.contains(numbers1.get(i))) {
					commons.add(numbers1.get(i));
				}
			}			
			return commons;
		}
		
		public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> numbers3) {
			
			for (int i = 0; i<numbers3.size(); i++) {  //i = 2   k = 3
				
				for (int k = i+1; k<numbers3.size(); k++) {
						//1						1
					if (numbers3.get(i) == numbers3.get(k)) {
						
						numbers3.remove(k);
						k--; 
					}
					
				}	
				
			}
			return numbers3;
		}

}
