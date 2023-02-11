package section5_1;

public class Exercises4 {
	
	public static void main(String[] args) {
		
		//swap the values at index 0 and 1
				String [] names = {"Fred", "John"}; //{"John", "John"}
				
				System.out.println(names[0] +" " + names[1]);
				String temp = names[0]; //"Fred"
				names [0] = names[1];
				names[1] = temp;
				
				System.out.println(names[0] +" " + names[1]);
	}

}
