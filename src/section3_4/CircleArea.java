package section3_4;

public class CircleArea {
	
	public static void main (String[] args ) {
		
		double areaOfCircle1 = circleArea(2.4);
		double areaOfCircle2 = circleArea(8);
		
		System.out.println("Area of the first circle is : " + areaOfCircle1);
		System.out.println("Area of the second circle is: " + areaOfCircle2);
		System.out.println("Area of the third circle is: " + circleArea(3.1));
		
	}

	public static double circleArea(double radius) {
		
		double area = radius * radius * Math.PI;
		return area;
		
	}
}
