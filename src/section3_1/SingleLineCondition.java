package section3_1;

public class SingleLineCondition {
	
	public static void main(String[] args) {
		
		int cityA = 4;
		int cityB = 9;
		
		int difference = (cityB > cityA) ?
				cityB - cityA :
				cityA - cityB;
		
		//      if (cityB > cityA) {
		//   		difference = cityB - cityA;
		//		} else {
		//			difference = cityA - cityB;
		//		}
		
		System.out.println("The other way of time difference between city A and B is " + difference + " hours.");
		
		System.out.print("Difference is " + difference + " hour" + ((difference > 1) ? "s ." : "."));
	}

}
