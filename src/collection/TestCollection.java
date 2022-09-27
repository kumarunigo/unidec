package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestCollection {

	public static void main(String[] args) {
		HashSet<String> names=new HashSet<String>();
			//ArrayList<String> names=new ArrayList<String>();
			names.add("john");
			names.add("jane");
			names.add("mike");
			names.add("john");
			// List is indexed.... ordered.. duplicate allowed
			//System.out.println(  names.get(2) );
			// set is unique, not indexed
			
			// removing items from list : can be done by item value or index
			// removing items from set : can be done by item value 
			System.out.println( names );
			names.remove("mike");
			System.out.println( names );
			names.remove(1);
			System.out.println( names );
			
			
			
	}

}
