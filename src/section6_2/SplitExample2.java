package section6_2;

public class SplitExample2 {
	
	 public static void main(String args[]){  
	        String s1 = "welcome to split world";  
	        
	        System.out.println("returning words: ");  
	        for ( String word : s1.split(" ", 0) ) {  // splitting, creating an array and looping on the same line
	            System.out.print( word + "," );  
	        }  
	        System.out.println("\n");

	        System.out.println("returning words: ");  
	        for ( String word : s1.split(" ", 1) ) {  // splitting, creating an array and looping on the same line
	            System.out.print( word + "," );  
	        }  
	        System.out.println("\n");

	        System.out.println("returning words:");  
	        for ( String word : s1.split(" ", 2) ) {  // splitting, creating an array and looping on the same line
	            System.out.print( word + "," );  
	        }  
	    }

}
