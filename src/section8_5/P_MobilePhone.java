package section8_5;

abstract class P_MobilePhone extends P_Phone implements P_Carryable {
	
	public P_Provider provider;
	public String IME_ID;
	
	abstract void ring();
	
	abstract void touchScreen();
	
	public void carryAround() {
		System.out.println("Carrying around MobilePhone...");
	}

}
