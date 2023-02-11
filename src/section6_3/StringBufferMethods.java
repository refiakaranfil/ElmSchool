package section6_3;

public class StringBufferMethods {
	
	public static void main(String[] args) {
		
		// append(String s)   Similar to String class concat()
		StringBuffer sb = new StringBuffer("Hello ");  
        sb.append("Java");                            // value of 'sb' is mutated   // we can write 5 or false instead of "Java"
        System.out.println(sb);
        
        // insert(int offset, String s)  
        StringBuffer stb = new StringBuffer("Hello ");  
        stb.insert(1, "Java");                            // 'stb' is mutated
        System.out.println(stb);
        
        //replace(int startIndex, int endIndex, String str)
        StringBuffer sb2 = new StringBuffer("Hello");  
        sb2.replace(1, 3, "Java");                  
        System.out.println(sb2);
        
        //delete(int startIndex, int endIndex)
        StringBuffer sb3 = new StringBuffer("Hello");  
        sb3.delete(1, 3);  
        System.out.println(sb3);
        
        //reverse()
        StringBuffer sb4 = new StringBuffer("Hello");  
        sb4.reverse();  
        System.out.println(sb4); 
        
        /*
         *  public char charAt(int index): is used to return the character at the specified position.
         *  public int length(): is used to return the length of the String invoking the method (i.e. total number of characters).
         *  public String substring(int beginIndex): is used to return the sub-string from the specified beginIndex.
         *  public String substring(int beginIndex, int endIndex): is used to return the sub-string from the specified beginIndex and and up to the endIndex.
         */
        
        
	}

}
