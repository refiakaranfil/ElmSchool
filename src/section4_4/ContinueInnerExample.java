package section4_4;

public class ContinueInnerExample {
	
	public static void main(String[] args) {  
		   
        for(int i = 1 ; i <= 3 ; i++){            // declaring an outer loop that will iterate from 1 to 3, inclusive

            for(int j = 1 ; j <= 3 ; j++){        // declaring an inner loop that will iterate from 1 to 3, inclusive

                if(i == 2 && j == 2){             // if both 'i' and 'j' are equal to 2
                    continue;                     // we will ignore the rest of the code inside the INNER LOOP
                }                                 // and continue to the next iteration of the INNER LOOP

                System.out.println(i+" "+j);      // display the values of 'i' and 'j' separated by a space

            }                                     // end of the inner loop

        }                                         // end of the outer loop
    }  

}
