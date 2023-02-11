package section3_4;

public class DistanceCalculator {
	
	public static void main (String[] args ) {
		
		System.out.println( distance(1.0, 2.0, 5.0, 5.0) );
		
		// Find the distance between two points on a plain surface defined
		// by coordinates (x1, x2) for the first point, and (x2, y2) for the second point.
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		
		double sideB = Math.abs( x2 - x1 );
		double sideA = Math.abs( y2 - y1 );
		
		double squared = Math.pow(sideA, 2) + Math.pow(sideB, 2);
		double result = Math.sqrt(squared);
		return result;
	}

}
