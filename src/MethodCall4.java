public class MethodCall4 {
	
	public void exc() {
		Person p=new Person("john");
		test(p,10);
	}
	public Person test(Person p,int a) {			
		p.name="jane"; 	//	#abc=jane
		p=test2(p); 		
		return p;		
	}			
	public Person test2(Person p2) {	//#abc		
		p2.name="mike";	// #abc mike	
		test3();
		return p2;		
	}			
	public void test3() {
		
	}

	
}
