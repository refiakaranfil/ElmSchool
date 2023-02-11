package section4_4;

public class BreakingWhileExample {
	
	public static void main(String[] args) {  

        int i = 1;                          //INITIAL value
        while( i <= 10 ){                   //CONDITION to loop until i <= 10

            if( i == 5 ){                   //if condition to check for i == 5
                i++;                        //increment i
                break;                      //BREAK the loop  
            }  

            System.out.println(i);          //print statement
            i++;                            //UPDATE the value

        } 
        
   //     int i = 1;                                //INITIAL value
   //     do {                                      //entering the do...while block

   //         if (i == 5){                          //if condition to check for i == 5
   //            i++;                               //increment i
   //            break;                             //BREAK the loop
   //         }      

   //         System.out.println(i);                //print statement
   //         i++;                                  //UPDATE the value

   //     } while ( i <= 10 );                      //CONDITION to loop until i <= 10
    
   }
}
