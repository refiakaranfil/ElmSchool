package section7_1;

public class TestBankAccount2 {
	
	public static void main(String[] args) {
		
		BankAccount2 account2 = new BankAccount2();
		
		account2.constructor("Refia Karanfil", 7000);
		account2.depositMoney(2000);
		account2.withDrawFrom(1000, "BOA");
		account2.printBankAccount();
	}

}
