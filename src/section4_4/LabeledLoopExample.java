package section4_4;

public class LabeledLoopExample {
	
	public static void main(String[] args) {  

        //Labeling the outer for loop as 'outer'
        outer:  
        for(int i = 1 ; i <= 3 ; i++) {  

            //Labeling the inner for loop as 'inner'
            inner:  
            for(int j = 1 ; j <= 3 ; j++){  
                if ( i == 2 && j == 2 ){  
                    break outer;  
                }  

                System.out.println(i+" "+j);  
            }  

        }  

    }  

}
