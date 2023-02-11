package section3_4;

public class A342_MyMath {
	
	public static void main(String[] args) {
	
		if (isTriangle (3,6,9)) {
			System.out.println("It is triangle.");
		} else { 
			System.out.println("It is NOT triangle.");
		}
		
		System.out.println("The area of square is: " + areaSquare (5));
		System.out.println("The area of rectangle is: " + areaRectangle(4,7));
		System.out.println("The area of circle is: " + areaCircle(2.0));
		System.out.println("The area of right cylinder is: " + areaRightCylinder(3.0,2.0));
	}

	public static boolean isTriangle (int a, int b, int c) {
				
		boolean result = (c <= (a + b) && b <= (a + c) && a <= (b + c));
		
			return result;
	}
	
	public static int areaSquare(int a) {
		
		int squareArea = a * a;
		
		return squareArea;
	}
	
	public static int areaRectangle(int a, int b ) {
		
		int rectangleArea = a * b;
		
		return rectangleArea;		
	}
	
	public static double areaCircle(double radius) {
		
		double circleArea = radius * radius * Math.PI;
		
		return circleArea;
}
	
	public static double areaRightCylinder(double radius, double a) {
		
		double cylinderArea = a * radius * radius * Math.PI;
		
		return cylinderArea;
	}
}