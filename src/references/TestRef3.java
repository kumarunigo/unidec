package references;

public class TestRef3 {

	public static void main(String[] args) {
		FacebookCustomer fb1=new FacebookCustomer();
		FacebookCustomer fb2=new FacebookCustomer();
		System.out.println(fb1.name );
		fb1.name="jane";
		fb1=fb2;
		fb2.name="mike";
		System.out.println( fb1.name );
		System.out.println( fb2.name );

	}

}
