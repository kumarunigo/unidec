package inheritance;

public class TestInheritance {

	public static void main(String[] args) {
	
		Child chi=new Child();
		System.out.println("*****");
		chi.sub(10, 20);
		System.out.println("*****");
		
		
		chi.add(10, 20);// inherited from parent
		chi.mul(12, 1);
		System.out.println( chi.a);// inherited from parent
		System.out.println( chi.b);
		System.out.println( chi.x);
		
		
		
	}

}
