package section9_2;

import java.util.*;

public class SortPractice {
	
	public static void main (String[]args) {
		
		ArrayList<Integer> numbers = new ArrayList<> ();
		// insertion order
		numbers.add(10);
		numbers.add(1);
		numbers.add(8);
		numbers.add(23);
		numbers.add(-4);
		
		ArrayList<String> words = new ArrayList<> ();
		words.add("java");
		words.add("selenium");
		words.add("git");
		words.add("python");
		
		System.out.println(words);  //sort() comes from Collections Class it sorts given list in a natural order		
		
		Collections.sort(words);   //sort() comes from Collections Class it sorts given list in a natural order		
		System.out.println(words); 		
		
		words.sort(Comparator.naturalOrder()); // comes from List Interface. Sort given list either in natural order or reverseOrder
		System.out.println(words);
		
		words.sort(Comparator.reverseOrder()); //  "     "   "       "		
		System.out.println(words);
		
		
		ArrayList<Person> people = new ArrayList<>();
		Person p1 = new Person("Jeff", 50, 701);
		Person p2 = new Person("Mark", 50, 702);
		Person p3 = new Person("Aiden", 50, 703);
		Person p4 = new Person("Apple", 85, 703);
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		
//	//	Collections.sort(people);
//		System.out.println(people);
//		
//		Collections.sort(people, Comparator.comparing(p -> p.age)); // we can sort based on fields
//		System.out.println(people);
		
		
		
		System.out.println(people);
		
		Collections.sort(people);
		System.out.println(people);
		

	}

}
