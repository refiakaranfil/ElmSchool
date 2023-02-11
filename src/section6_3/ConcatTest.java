package section6_3;

public class ConcatTest {
	
	   /** Internal loop iterates 10_000 times and 
	    *   concatenates a String literal to local String variable.
	    *   Returns the final concatenated String value.
	    */
	    public static String concatWithString()    {  
	        String s = "Java4SDETs by ";  

	        for (int i = 0; i < 10000; i++){  
	            s = s + "UMSEducation";  
	        }  

	        return s;  
	    }  

	    /** Internal loop iterates 10_000 times and 
	    *   concatenates a String literal to local StringBuffer object
	    *   utilizing the append() by StringBuffer class.
	    *   Returns the final concatenated String value.
	    */
	    public static String concatWithStringBuffer(){  
	        StringBuffer sb = new StringBuffer("Java4SDETs by ");  

	        for (int i = 0; i < 10000; i++){  
	            sb.append("UMSEducation");  
	        }  

	        return sb.toString();  
	    }  

	    /** Main method which calls the custom methods above.
	    *   It captures the current time in milliseconds before invoking a method
	    *   and then captures the current time right after the method execution is complete.
	    *   Then, it displays the difference between the completion and start times
	    *   to demonstrate how long it takes for each method to run.
	    */
	    public static void main(String[] args){  
	        long startTime = System.currentTimeMillis();    // capture current time in milliseconds
	        concatWithString();                             // call the method, no need to capture the return
	        long finishTime = System.currentTimeMillis();   // capture current time in milliseconds
	        long executionTime = finishTime - startTime;    

	        System.out.println("Time taken for concatenating with String: " + executionTime + "ms.");  
	        

	        startTime = System.currentTimeMillis();         // capture current time in milliseconds
	        concatWithStringBuffer();                       // call the method, no need to capture the return
	        finishTime = System.currentTimeMillis();        // capture current time in milliseconds
	        executionTime = finishTime - startTime;

	        System.out.println("Time taken for appending with StringBuffer: "+ executionTime + "ms.");  
	    } 

}
