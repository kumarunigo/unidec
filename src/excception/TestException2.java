package excception;

public class TestException2 {

	 Person p1=new Person();
	 Person p2;// default value is null
	//1) dont use dot on null value variable (
	//2) initialize the variable "=new Person()"
	
	public void method() {
		System.out.println( p1.name );
		
		// dot is applied on "this"
		System.out.println( this.p2 );
		
		// dot is applied on "this"
		// dot is applied on p2
		System.out.println( this.p2.name );
	}

}
