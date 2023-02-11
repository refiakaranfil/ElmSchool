package section8_3;

public class J_Animal {
	
	int maneLength;
	
	static{	
	System.out.println("static block from Animal");
	}
	
	{		
	System.out.println("non-static block from Animal");	
	}

	public void neigh() {
	System.out.println("Horse sounds neigh");	
	}

	//Method overriding happening in between sub and super

	public void eat() {
	System.out.println("Horses love to eat sugar");
	}
}
