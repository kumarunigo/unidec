package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class CollTest {

	public static void main(String[] args) {
		Student s1=new Student(1,"john doe",1);
		Student s3=new Student(1,"jane doe",2);
		Student s4=new Student(1,"mike doe",3);
		Student s5=new Student(1,"john doe",4);
		
		Student s2=new Student(2,"andy doe",1);
		Student s6=new Student(2,"ron doe",2);
		Student s7=new Student(1,"john doe",4);

		HashSet<Student> school=new HashSet<Student> ();
	 	school.add(s1);
	 	school.add(s2);
	 	school.add(s3);
	 	school.add(s4);
	 	school.add(s5);
	 	school.add(s6);
	 	school.add(s7);
		 	System.out.println(school.size());
	 	for(Student s: school)
	 		System.out.println(s);
	 	
	 	
	 	HashMap<String, Integer> scores=new HashMap<String, Integer> ();
	 	scores.put("john", 65);
	 	scores.put("jane", 75);
	 	scores.put("mike", 60);
	 	scores.put("john", 60);
	 	System.out.println(scores);
	 	scores.remove("mike");
	 	System.out.println(scores);
	 	
	}

}
