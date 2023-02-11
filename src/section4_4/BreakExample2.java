package section4_4;

public class BreakExample2 {
	
	public static void main(String[] args) {  

        for(int i = 1 ; i <= 3 ; i++){            // outer loop   

            for(int j = 1 ; j <= 3 ; j++){        // inner loop  

                if( i == 2 && j == 2 ){    
                    break;                        //using break statement inside the inner loop  
                }    
            System.out.println(i + " " + j);    
            }    

        }    
    }  
}  

// Pay a very close attention to the output of this loop. Do you see how the output of
// '2 2' is missing? That's because when both i and j are equal to 2, then our inner
// loop where we have the print statement breaks. But wait a minute, why is the
// output '2 3' missing? Do you see the answer to this question? It is simple right?
// If the inner loop is broken, it will not continue running, that's why we also skip
// any future iterations of the inner loop (which would've printed '2 3' for us) and
// jump directly to the next iteration of the outer loop that again calls the inner loop
// and keeps on printing.

