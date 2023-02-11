package section5_3;

public class TestJaggedArray {
	
	public static void main(String[] args){  
        int arr[][] = new int[3][];                      // declaring a 2D array with 3 sub-arrays  
            arr[0] = new int[3];                         // first array has a size of 3
            arr[1] = new int[4];                         // second array has a size of 4
            arr[2] = new int[2];                         // third array has a size of 3

        int count = 0;                                   // initialize an int variable 'count' to 0
        for (int i = 0; i < arr.length; i++)  {          // traverse the array
            for(int j = 0; j < arr[i].length; j++)  {    // traverse each array element of the array
                arr[i][j] = count++;                     // assign the value of count to each element and 
            }                                            //    increment the count
        }
   
        for (int i = 0; i < arr.length; i++){            // traverse the array
            for (int j = 0; j < arr[i].length; j++){     // traverse each array element of the array
                System.out.print(arr[i][j]+" ");         // print out the value of each element
            }  
            System.out.println();                        // add a new line  
        }  
    }  

}
