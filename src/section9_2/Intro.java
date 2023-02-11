package section9_2;

import java.util.ArrayList;

public class Intro {
	
	// Iterable > Collection > Set, List, Queue
	
	public static void main(String[] args) {
		
		int a = 15;
		
		Integer b = a; //auto-boxing
		
		ArrayList <Integer> listOfInts = new ArrayList<>(3);
		
		listOfInts.add(5);
		listOfInts.add(1);
		listOfInts.add(10);
		listOfInts.add(28);
		
		System.out.println(listOfInts);
		

	}

}
