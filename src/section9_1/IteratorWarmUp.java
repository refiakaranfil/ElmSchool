package section9_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorWarmUp {
	
	public static void main (String[]args) {
		
		ArrayList<String> words = new ArrayList<>();
		
		words.add("Hi");
		words.add("Hello");
		words.add("howdy");
		words.add("bye");
		words.add("see you never");
		
		//for loop
		//for each loop
		//iterator
		
		//[hi, hello, howdy, bye, see you never]
		Iterator<String> iterator = words.iterator();
		
	//	System.out.println(iterator.hasNext());
	//	System.out.println(iterator.next());
	//	System.out.println(words);
	//	System.out.println(iterator.next());
	//	System.out.println(iterator.next());
	//	System.out.println(iterator.hasNext());
	//	System.out.println(iterator.next());
	//	System.out.println(iterator.next());
	//	System.out.println(iterator.hasNext());
		
		System.out.println(iterator.next());
		iterator.remove();
		iterator.remove();
		System.out.println(words);
		
		ListIterator<String> listIterator = words.listIterator();
		while(listIterator .hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println();
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	
	}

}
