package section7_1;

public class TestBankAccount {
	
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		
		account1.insertData(10097364, "Refia K", 1.0);
		account1.deposit(1000);
		account1.withdraw(750);
		account1.display();
	}

}
