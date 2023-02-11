package section4_1;

public class EncapsulationAndGeneralization2 {
	
	public static void main(String[] args ) {
		
		multiplicationTable(10);
	}

	public static void multiplication(int num , int columns) {

	    int i = 1;
	    while (i <= columns) {
	        System.out.print( (num * i) + " " );
	        i++;
	    }

	    System.out.println();
	}
	
	public static void multiplicationTable(int rows) {
		

		int i = 1;
		while (i <= rows) {
		    multiplication( i, i );
		    i++;
		}	
	}
}