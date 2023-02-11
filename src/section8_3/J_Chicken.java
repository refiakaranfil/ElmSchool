package section8_3;

public class J_Chicken extends J_Bird {
	
	int dailyEggCount;

	{
	System.out.println("non-static block from Chicken");
	}

	static {
	System.out.println("static block from Chicken");
	}

}
