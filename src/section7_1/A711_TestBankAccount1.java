package section7_1;

public class A711_TestBankAccount1 {
	
	public static void main(String[] args) {
		
		A711_BankAccount1 account1 = new A711_BankAccount1();
		
		account1.insert(32523, "Refia", 7000.0);
		account1.display();
		account1.checkBalance();
		
		account1.deposit(2000.0);
		account1.checkBalance();
		
		account1.withdraw(300.0);
		account1.checkBalance();
	}

}
