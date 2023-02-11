package section7_1;

public class A711_BankAccount1 {
	
	int accountNumber;
	String accountHolder;
	double amount;
	static String bankName;
	static String accountLocation;
	static String bankAddress;
	
	static {
		bankName = "Bank of America";
        accountLocation = "Madison, WI";
        bankAddress = "2917 Muir field Rd, Madison WI, 53719";
        System.out.println("Bank Name: " +bankName + "\nOpened Location:  "+accountLocation + "\nAddress: " +bankAddress);
    }
	
	void insert(int i, String s, double d) {
		accountNumber = i;
		accountHolder = s;
		amount = d;
	}
	
	void deposit(double p) {
		amount += p;
		System.out.println(p + " deposited");
	}
	
	void withdraw(double w) {
		if (amount < w) {
			System.out.println("Insufficient Balance");
		} else {
			amount -= w;
			System.out.println(w + " withdrawn");			
		}
	}
	
	void checkBalance() {
		System.out.println("Balance is: " + amount);
	}
	
	void display() {
		System.out.println(accountNumber + " " + accountHolder + " " + amount);
	}

}
