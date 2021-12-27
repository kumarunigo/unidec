public class MethodCall4 {
	public Person test(Person p,int a) {			
		p.name="jane"; 	//	#abc=jane
		p=test2(p); 		
		p=new Person();//#pqr = john
		return p;		
	}			
	public Person test2(Person p2) {	//#abc		
		p2.name="mike";	// #abc mike	
		return p2;		
	}			

	
}
