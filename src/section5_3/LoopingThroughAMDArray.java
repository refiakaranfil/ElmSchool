package section5_3;

import java.util.Arrays;

public class LoopingThroughAMDArray {
	
	public static void main(String [] args) {
		
		String[][] countries = { 
	            {"Canada", "Vancouver", "Calgary", "Edmonton", "Ottawa", "Quebec City"},
	            {"The USA", "New York City", "Los Angeles", "Chicago", "Houston", "Phoenix"},
	            {"Mexico", "Mexico City", "Ecatepec", "Guadalajara", "Puebla", "Tijuana"}
	           };

		//Since we know how to traverse an array, let's use the same approach and
		//try to traverse this 2D array and see what happens:
		
	    //	for (int i = 0; i < countries.length; i++) {
	    //	    System.out.println( countries[i] );
		//  }
		
		for (int i = 0; i < countries.length; i++) {
		     System.out.println( Arrays.toString(countries[i]) );
	    }
		
		System.out.println();
		
		for (int i = 0; i < countries.length; i++) {     // traverse array

		    String[] country = countries[i];             // assign each array element to a local array called 'country'
		    for (int j = 0; j < country.length; j++) {   // traverse the current 'country' array
		        System.out.print( country[j] + " " );    // display the element of 'country' and concatenate ' ' after
		    }
		        
		    System.out.println();                        // add newline to separate each iteration output from each other
		}
		
		System.out.println();
		
		for (int i = 0; i < countries.length; i++) {        // traverse array

		    for (int j = 0; j < countries[i].length; j++) { // traverse the current array at index 'i' (countries[i])
		        System.out.print( countries[i][j] + " " );  // display the element at [i][j], and concatenate ' '
		    }
		        
		    System.out.println();                           // add newline to separate each traverse from each other
		}
		
	}
}
