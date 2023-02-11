package section7_1;

public class BankAccount2 {
	
	String accountHolder;
	double accountBalance;
	static String bankName = "ELM";
	
	void constructor(String name, double balance) {
		accountHolder = name;
		accountBalance = balance;
	}
	
	void depositMoney(double deposit) {
		accountBalance += deposit;
	}
	
	void withDrawFrom(double withDraw, String bank) {
		if (bankName.equals(bank)) {
			if (withDraw <= accountBalance) {
				accountBalance -=withDraw;
			}else {
				System.out.println("Insufficient Balance");
			}
		}else {
			// 100 100
			if (withDraw + withDraw*0.03 <= accountBalance) {
				//100 +3
				accountBalance -= (withDraw + withDraw*0.03);
			}else {
				System.out.println("Insufficient Balance");
			}
		}		
	}
	
	void printBankAccount() {
		System.out.println("Acoount Holder: " + accountHolder);
		System.out.println("Account Balance: " + accountBalance);
		System.out.println("Bank: " + bankName);
	}

}
