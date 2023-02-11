package section6_1;

public class StringConcatenationPlusOperatorWithPrimitives {
	
	public static void main(String[] args) {
		
		String s = "Java" + 4 + "SDET" + 's';  
        System.out.println( s );  
        
        String s1 = "UMS";  
        String s2 = "Educatin";  
        String s3 = s1.concat( s2 );  
    
        System.out.println( s3 );
        
        String str = "java";
        System.out.println(str);
        
        str = str.concat(" is the best.").concat(" And I love it.");
        System.out.println(str);
        
}
}