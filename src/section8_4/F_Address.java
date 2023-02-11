package section8_4;

public class F_Address {
	
	public int streetNumber;
    public String streetName;
    public String city;
    public String state;
    public String zip;

    public F_Address(int streetNumber, String streetName,
                String city, String state, String zip) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    public String toString() {
    	return this.streetNumber + this.streetName + ", " + this.city + ", " + this.state + this.zip;
    }

}
