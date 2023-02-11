package section5_3;

public class MDArraysLoop {
	
	public static void main(String[] args) {
		
		String [] carsBrandsOfUSA = {"Ford", "Lincoln", "GMC", "Tesla"};
		
		String [] carsBrandsOfGermany = {"Mercedes", "BMW", "Volkwagen", "Audi"};
		
		String [] carsBrandsOfItaly = {"Ferrari", "Maserati", "Fiat", "Bugatti"};
		
		String [] [] topCarBrands = {carsBrandsOfUSA, carsBrandsOfGermany, carsBrandsOfItaly};
		
		for (int i = 0; i < topCarBrands.length; i++) {
			
			for (int k = 0; k < topCarBrands[0].length; k++) {
				
				String car = topCarBrands[i][k];
				System.out.println(car);
			}
		}
		
	}
	
}
	