package section6_3;

public class ConcatTest2 {
	
	/** Internal loop iterates 100_000 times and 
     *   concatenates a String literal to local String variable.
     */
     public static void concatWithString()    {  
         String s = "Java4SDETs by ";  
         for (int i = 0; i < 100_000; i++){  
             s = s + "UMSEducation";  
         }  
     }  

     /** Internal loop iterates 100_000 times and 
     *   concatenates a String literal to local StringBuffer object
     *   utilizing the append() by StringBuffer class.
     */
     public static void concatWithStringBuffer(){  
         StringBuffer sb = new StringBuffer("Java4SDETs by ");  
         for (int i = 0; i < 100_000; i++){  
             sb.append("UMSEducation");  
         }  
     }  
     
     /** Internal loop iterates 10_000 times and 
             *   concatenates a String literal to local StringBuffer object
             *   utilizing the append() by StringBuilder class.
             */
      public static void concatWithStringBuilder(){  
         StringBuilder sb = new StringBuilder("Java4SDETs by ");  
         for (int i = 0; i < 100_000; i++){  
             sb.append("UMSEducation");  
         }  
     } 

     /** Main method which calls the custom methods above.
     *   It captures the current time in milliseconds before invoking a method
     *   and then captures the current time right after the method execution is complete.
     *   Then, it displays the difference between the completion and start times
     *   to demonstrate how long it takes for each method to run.
     */
     public static void main(String[] args){  
         long startTime = System.currentTimeMillis();  
         concatWithString();  
         long finishTime = System.currentTimeMillis();
         long executionTime = finishTime - startTime;

         System.out.println("Time taken for concatenating with String: " + executionTime + "ms.");  
         

         startTime = System.currentTimeMillis();  
         concatWithStringBuffer();  
         finishTime = System.currentTimeMillis();
         executionTime = finishTime - startTime;
         
         System.out.println("Time taken for appending with StringBuffer: "+ executionTime + "ms.");  
         

         startTime = System.currentTimeMillis();  
         concatWithStringBuilder();  
         finishTime = System.currentTimeMillis();
         executionTime = finishTime - startTime;
         
         System.out.println("Time taken for appending with StringBuilder: "+ executionTime + "ms.");  
     }  

}
