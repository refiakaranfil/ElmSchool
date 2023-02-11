package section8_4;

public class H_Employee {
	
	H_Person person;	
	H_Address address;
	
	public H_Employee(H_Person person, H_Address address) {
		this.person = person;
		this.address = address;	
	}
	
	public String toString() {
		return address.toString();
	}

}
