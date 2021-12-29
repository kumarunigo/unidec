
public class Child extends Parent{
	int age=20;
	public void conflict(   ) {
		int age=10;
		System.out.println(   super.age );
	}
	
	public Child() {
		super(  "child" );// construct parent first
	}
	public int c=30;
	
	public void test(float f) {
		System.out.println("2nd child test ");
	}
	public void cMethod() {
		System.out.println("in child method");
	}
}
