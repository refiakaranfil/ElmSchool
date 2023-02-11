package section8_2;

public class VarArgs {
	
	// variable arguments
	
	public static void main(String[] args) {
		
		print("sdfd", "sdfsds", "Saaw", "343");
	}
	
	public static void print(String ... a) {
		for (String str : a) {
			System.out.println(str);
		}
	}

}
