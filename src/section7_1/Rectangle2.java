package section7_1;

public class Rectangle2 {
	
	int length;
	int width;
	
	void insert(int l, int w) {
		length = l;
		width = w;
	}
	
	void calculateArea() {
		System.out.println(length * width);
	}

}
