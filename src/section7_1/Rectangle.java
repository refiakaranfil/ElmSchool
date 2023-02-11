package section7_1;

public class Rectangle {
	
	int length;
	int width;
	int perm;
	int area;
	
	
	void insert(int l, int w) {
		length = l;
		width = w;		
	}
	
	void perimeter() {
		perm = 2*(length + width);
	}
	
	void area() {
		area = length * width;
	}

}
