package section7_1;

public class TestRectangle {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		
		r1.insert(5,8);
		r1.area();
		r1.perimeter();
		
		System.out.println(r1.area);
		System.out.println(r1.perm);
	}

}
