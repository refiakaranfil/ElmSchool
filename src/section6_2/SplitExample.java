package section6_2;

public class SplitExample {
	
	public static void main(String args[]){  
        String s1 = "Java String split method by UMSEducation";  

        String[] words = s1.split(" ");                         // split by space (' ')
        for(String word : words){  
            System.out.println( word );  
        }  
    }

}
