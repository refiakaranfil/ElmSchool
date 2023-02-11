package section8_4;

public class H_Main {
	
	public static void main(String[] args) {
		H_Person person = new H_Person("John Does", 35);
		H_Address address = new H_Address("123 Main St.","Anytown","XX","12345");
		H_Employee employee = new H_Employee(person, address);
		System.out.println(employee.toString());
	}

}
