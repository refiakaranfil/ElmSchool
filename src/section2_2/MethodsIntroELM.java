package section2_2;

public class MethodsIntroELM {
	
	public static void main(String[] args) {
		
		methodWithParameter("apple");
		myFirstMethod();
		System.out.println("hello");
		myFirstMethod();
		
	}

	public static void myFirstMethod() {
		
		System.out.println("My first method");
		
	}
		
	public static void methodWithParameter(String word) {
		
		String localString = word;
		System.out.println(localString);
				
	//	System.out.println("our word is " + word);
		
	}
	
	public static void printFirstLetter(String argument) {
		
		System.out.println(argument.charAt(0));
		
	}
	
	}
