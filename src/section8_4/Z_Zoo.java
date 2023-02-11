package section8_4;

public class Z_Zoo {
	
	public static void main(String[] args) {
		
		// we are creating an object animal class
		// new keyword invokes constructor of class
		// if there is no constructor java provides default constructor
	//	Z_Animal animal = new Z_Animal("Dog", 4); 
	//	System.out.println(animal.name);
	//	System.out.println(animal.numLegs);
		
		Z_Dog dog = new Z_Dog("Rex", 4); // default constructor
		
		System.out.println(dog.name);    //Animal with super()
		System.out.println(dog.numLegs); //Animal
		System.out.println(dog.breed);   //Dog
	}
	
	

}
