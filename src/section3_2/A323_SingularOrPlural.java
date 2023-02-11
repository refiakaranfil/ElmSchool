package section3_2;

public class A323_SingularOrPlural {
	
	public static void main(String[] args) {
		
		int pound = 1;
		
		String message = (pound == 1) ?"There are " + pound + " pound of apples left."

                : "There are " + pound + " pounds of apples left.";

		System.out.println(message);
	}

}
