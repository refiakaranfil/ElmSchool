package section4_4;

public class ContinueExample2 {
	
	public static void main(String[] args) {  
	    
        for(int i = 1 ; i <= 10 ; i++){          // for loop to iterate from 1 to 10, inclusive

            if( i == 5 ){                        // if 'i' is equal to 5
                continue;                        // ignore everything from this point on and jump to the next iteration
            }  

            System.out.println(i);               // display the value of 'i'
        }  
    }  
}  
