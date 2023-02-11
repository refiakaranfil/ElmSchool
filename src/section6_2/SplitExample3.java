package section6_2;

import java.util.Arrays;

public class SplitExample3 {
	
	public static void main(String[] args) {
		
		String str = "ELM school provides good studying materials";
		
		String [] words = str.split(" ", 3);  // try with "good"
		
		System.out.println(Arrays.toString(words));
		
		for (String word : words) {
			
			System.out.println(word);
		}
		
		
	}

}
