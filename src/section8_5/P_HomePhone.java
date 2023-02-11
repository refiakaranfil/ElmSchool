package section8_5;

public class P_HomePhone extends P_Phone implements P_Carryable{
	
	public boolean isWired;
	
	public P_HomePhone() {
		super();
	}
	
	public void ring() {
		System.out.println("HomePhone is ringing...");
	}
	
	public void carryAround() {
		
	}

}
