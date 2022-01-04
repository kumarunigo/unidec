package collection;

import java.util.*;

import exceptions.Person;

public class CollectionTest {

	public static void main(String[] args) {
		 	HashSet<String> names=new HashSet<String> ();
		 	names.add("john");
		 	names.add("jane");
		 	names.add("john");
		 	names.add("mike");
		 	System.out.println(names);
		 	names.remove("jane");
		 	System.out.println(names);
		 	names.add(2,"ron");
		 	System.out.println(names.get(2));
		 	System.out.println(names);
		 	HashSet<Person> per=new HashSet<Person> ();
		 	Person p1=new Person();
		 	per.add(p1);
		 //	per.add("john");
		 	System.out.println("**********");
		 	ArrayList<String> se=new ArrayList<String> ();
		 	se.add("john");
		 	se.add("jane");
		 	se.add("john");
		 	se.add("mike");
		 	se.remove("mike");
		 	System.out.println(se);
		 	
	}
}