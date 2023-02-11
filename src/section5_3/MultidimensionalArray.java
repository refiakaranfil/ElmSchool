package section5_3;

public class MultidimensionalArray {

	public static void main(String [] args) {
		
	
	//	String[][] countries = new String[195][6];  195 country arrays with top 5 populous city names in each
		
		String[][] countries = { 
                {"Canada", "Vancouver", "Calgary", "Edmonton", "Ottawa", "Quebec City"},
                {"The USA", "New York City", "Los Angeles", "Chicago", "Houston", "Phoenix"},
                };
		
		String fourthPopulousInUSA = countries[1][4];
		
		System.out.println(fourthPopulousInUSA);
		
		
	}

}
