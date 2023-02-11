package section4_4;

public class ContinueInnerLabel {
	
	public static void main(String[] args) {  
        outer:                                    // will declare a loop called 'outer'
        for(int i = 1 ; i <= 3 ; i++){            // declaring an outer loop that will iterate from 1 to 3, inclusive
            inner:                                // will declare a loop called 'inner'
            for(int j = 1 ; j <= 3 ; j++){        // declaring an inner loop that will iterate from 1 to 3, inclusive

                if(i == 2 && j == 2){             // if both 'i' and 'j' are equal to 2
                    continue inner;               // we will ignore the rest of the code inside the loop
                }                                 // and continue to the next iteration of the loop called 'inner'

                System.out.println(i+" "+j);      // display the values of 'i' and 'j' separated by a space

            }                                     // end of the inner loop

        }                                         // end of the outer loop
    }  

}
