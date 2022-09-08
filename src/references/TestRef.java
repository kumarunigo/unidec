package references;

public class TestRef {

	public static void main(String[] args) {
		FacebookCustomer fb1=new FacebookCustomer();	
		FacebookCustomer fb2=new FacebookCustomer();	
		FacebookCustomer fb3=new FacebookCustomer();	
			
		System.out.println( fb1.name );	
		System.out.println( fb2.name );	
		System.out.println( fb3.name );	
		fb1.name="mike";	
		System.out.println( fb1.name );	
		System.out.println( fb2.name );	
		System.out.println( fb3.name );	

	}

}
