package scopes;

public class TestScope {

	public static void main(String[] args) {
			// 2 copies/reference of Person category
			Person p1=new Person();
			Person p2=new Person();
			p1.name="john";
			p2.name="jane";
			System.out.println( p1.age);
			System.out.println( p1.name );
			System.out.println( p1.b );
			System.out.println( p1.a );
	}

}
