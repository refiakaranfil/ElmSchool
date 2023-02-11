package section2_2;

public interface MethodWarmUp {
	
	public static void main(String[] args) {
		
		personalInfo();
		
		
	}

	public static void personalInfo() {
		
		String name = "Refia";
		int yearofbirth = 1993;
		int currentyear = 2022;
		int age = currentyear - yearofbirth;
		
				
		System.out.println("Your Name: " + name);
		System.out.println("Your Birth Year: " + yearofbirth);
		System.out.println("Your Age: " + age);
		
	}
	
}
