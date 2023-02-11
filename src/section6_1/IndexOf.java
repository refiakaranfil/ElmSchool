package section6_1;

public class IndexOf {
	
	public static void main(String[] args) {
		
		// indexOf   finds the index of given char or string and returns int
		// if given char or string is not there it will return -1
		// this method is overloaded method
		// indexOf(value,from)
		
		
		String str = "Elm School";
		
		int idx = str.indexOf("l", 2);
		System.out.println(idx);
		
		
		
		String email = "kate.wilson@gmail.com";
        int dot = email.indexOf(".");
        String firstName = email.substring(0, dot);
        int at = email.indexOf("@");  
        String lastName = email.substring(dot + 1, at);
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName);
        
        
        String firstName1 = email.substring(0, email.indexOf('.'));
        String lastName1 = email.substring(email.indexOf('.') + 1, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1);
        
        System.out.println("First Name: " + firstName1);
        System.out.println("Last Name: " + lastName1);
        System.out.println("Domain: " + domain);
		
	}

}
