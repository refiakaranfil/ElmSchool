package section6_1;

public class StringMethodsPractice {
	
	public static void main(String[] args) {
		
		// length()
		// toLowerCase()
		// toUpperCase()
		// replace()        		replaces everything with provided value
		// equals()					checks if 2 strings are equal or not
		// equalsIgnoreCase()
		// substring()
		// charAt()
		// concat()
		// indexOf(value,from)
		// lastIndexOf(value, until)
		
		
		// concat()
		String s1 = "UMS";  
        String s2 = "Educatin";  
        String s3 = s1.concat( s2 );     
        System.out.println( s3 );
               
		// replace()
		String str = "I love java";		
		String str2 = "i love java";		
		str = str.replace("a", "");		
		System.out.println(str);
		
		// equalsIgnoreCase()
		System.out.println(str.equalsIgnoreCase(str2));
		
		// substring()
		String word = "Hello";		
		String str3 = word.substring(0, 3);		
		System.out.println(str3);
		
		
		
		String email = "refia.karanfil@gmail.com";
		System.out.println(fullName(email));	
		String word1 = "apple";
		
			if (word1.length() % 2 == 0 ) {
				System.out.println("" +word1.charAt(word1.length()/2 -1) + word1.charAt(word1.length()/2));				
			} else {
				System.out.println("" + word1.charAt(0) + word1.charAt(word1.length()/2) + word1.charAt(word1.length()-1));
			}
	}
	
	public static String fullName(String email) {
		
		String fullName = email.substring(0, 14);
		//refia karanfil
		fullName = fullName.replace("."," ");
		
		return fullName;
	}

}
