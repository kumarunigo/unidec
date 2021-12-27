public class Person {
	String name="john";
	int age=10;
	// compiler will provide default consstr
	// ONLY IF not written already
	public Person( String s) {
		name=s;
	}
	public Person( String s,int a) {
		name=s;
		age =a;
	}
	
}
