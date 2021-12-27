
public class Assignment {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		String c="john";
		String e="jane";
		Address g=new Address ();
		Address h=new Address ();
		
		// LHS primitive data type - RHS can be literal value or variable of same type
			a=20;
			a=b;		
		// LHS object complex data type - RHS can be new operator or variable of same type
			g=new Address();
			g=h;
		// LHS should ALWAYS be a variable	
			//new Address()=g;
			//10=a;
			//"jane"=c;
			
	}

}
