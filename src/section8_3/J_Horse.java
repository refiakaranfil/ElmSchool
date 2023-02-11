package section8_3;

public class J_Horse extends J_Animal{
	
	int maneLength;
	
	static{
	System.out.println("static block from Horse");
	}
	
	{
	System.out.println("non-static block from Horse");
	}

	public void neigh() {
	System.out.println("Horse sounds neigh");
	}

	//Method overriding happening in between sub and super

	public void eat() {
	System.out.println("Horses love to eat sugar");
	}
}
