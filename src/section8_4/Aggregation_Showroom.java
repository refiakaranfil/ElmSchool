package section8_4;

public class Aggregation_Showroom {
	
	public static void main(String[] args) {

		Aggregation_Mercedes gt= new Aggregation_Mercedes("Mercedes", 5, 250, "GT63", 4);

		//System.out.println(gt.toString());
		Aggregation_Person person = new Aggregation_Person("Fuad Suleyman", 777777777, gt);
		System.out.println(person.toString());

		}

}
