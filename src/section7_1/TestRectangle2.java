package section7_1;

public class TestRectangle2 {
	
	public static void main(String[] args) {
		
		Rectangle2 r1 = new Rectangle2();
		Rectangle2 r2 = new Rectangle2();
		
		r1.insert(5, 11);
		r2.insert(3, 15);
		
		r1.calculateArea();
		r2.calculateArea();
	}

}
