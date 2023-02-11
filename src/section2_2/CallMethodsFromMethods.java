package section2_2;

public class CallMethodsFromMethods {
	
	public static void main(String[] args) {
		
		sayHi();
		sayBye();
		
	}

	public static void sayHi() {
		
		System.out.println("hi");
		sayBye();
		
	}
	
	
	public static void sayBye() {
		
		System.out.println("bye");
		
	}
}
