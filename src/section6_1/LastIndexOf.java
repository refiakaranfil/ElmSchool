package section6_1;

public class LastIndexOf {
	
	public static void main(String[] args) {
		
		// lastIndexOf()
		// lastIndexOf(value, until)
		
		String str = "Hello World";
		
		System.out.println(str.indexOf("o")); 		//4
		System.out.println(str.lastIndexOf("o"));	//7
		System.out.println(str.indexOf("o", 5));	//7		find "o" from 5
		System.out.println(str.lastIndexOf("o",5)); //4     find "o" until 5
		
	}

}
