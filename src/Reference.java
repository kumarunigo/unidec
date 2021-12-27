public class Reference {
	public static void main(String[] args) {
		int a=10;	
		Student s1=new Student();	
		Student s2=new Student();	
		s2.name="jane";	
		s1.age=20;	
		s1.name="john";	
		s2.age=30;	
		s2.age=a;	
		s1.name=s2.name;	
		s2=s1;	
		s2=new Student();	
		System.out.println(  s1.name );	
		System.out.println(  s2.name );	
		System.out.println(  s1.age );	
		System.out.println(  s2.age );	

		
		
		
		/*
		
		
		Student s=new Student();
		// s = reference variable
		System.out.println(	s.name		);
		s.test();
		// dot operator
		// trying to access external variables
		// and method using reference varaible
		 * 
		 */
	}
}
