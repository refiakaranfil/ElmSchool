package section8_1;

public class TestBank {
	
	public static void main(String[] args) {

		Bank b1 = new Bank("Bill Vamos", 2185145, 262666626, 100.0);


		System.out.println(b1.getAccountHolder());
		System.out.println(b1.getAccountNumber());
		System.out.println(b1.getRouteNumber());
		System.out.println(b1.getBalance());


		// String name = b1.getAccountHolder();
		// System.out.println(name);

		// System.out.println(b1.getAccountHolder());
		// b1.setAccountHolder("John Doe");
		// System.out.println(b1.getAccountHolder());

		}
}
