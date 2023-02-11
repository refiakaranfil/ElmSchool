package section8_3;

public class Shape {
	
	private String name;
	private int length;
	
	public Shape() {
		
	}
		
	public Shape(String name, int lenght) {
		
		this.setName(name);
		this.setLength(lenght);		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}


}
