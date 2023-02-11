package section5_3;

public class MultiDimensionalArraysIntro {
	
	public static void main(String[] args) {
		
		String [] countries = {"USA", "Germany", "Italy", "Japan"};
		
		String [] carsBrandsOfUSA = {"Ford", "Lincoln", "GMC", "Tesla"};
		
		String [] carsBrandsOfGermany = {"Mercedes", "BMW", "Volkwagen", "Audi"};
		
		String [] carsBrandsOfItaly = {"Ferrari", "Maserati", "Fiat", "Bugatti"};
		
		String [] carsBrandsOfJapan = {"Toyota", "Honda", "Nissan", "Acura"};
		
		String [][] carBrands = new String [4][4];
		
		carBrands[0] = carsBrandsOfGermany;
		carBrands[1] = carsBrandsOfUSA;
		carBrands[2] = carsBrandsOfItaly;
		carBrands[3] = carsBrandsOfJapan;
		
		String car = carBrands[2][3];
		System.out.println(car);
		
		
		
	}

}
