package section5_2;

public class ArraysToString2 {
	
	public static void main(String[] args) {
		
	}
		

	public static String toString(int[] a) {    // declare a method that accepts an int array and returns a String
	    String retStr = "";                     // a String that will be returned, initialize it to empty String ("")
	    int lastElementIndex = a.length - 1;    // an int that will store the index of the last element

	    retStr += "[";                          // start by concatenating [ to the String
	    for (int i = 0; i < a.length; i++) {    // traverse through the array
	        
	        if (i == lastElementIndex) {        // if the current index is equal to the last element's index
	            retStr += a[i] + "]";           // concatenate the current element's value and ] character
	            break;                          // break the loop
	        }

	        retStr += a[i] + ", ";              // concatenate the current element's value and , character and a space
	    }

	    return retStr;                          // return the final value of the String variable
	}

}
