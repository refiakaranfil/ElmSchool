package section8_3;

public class J_Bird extends J_Animal{
	
	String color;
	String wings;

	{
	System.out.println("non-static block from Bird");
	}

	static {
	System.out.println("static block from Bird");
	}

	public void whistle() {
	System.out.println("Bird is whistling...");
	}

	public void eat() {
	System.out.println("Birds love to eat sunflower seeds");
	}
}
