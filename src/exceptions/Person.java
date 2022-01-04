package exceptions;

import collection.Student;

public class Person {
	String name="john";
	public boolean equals(Object o) {
		Person anotherStudObject=(Person )o;
		return this.name.equals(anotherStudObject.name);
	}
}
