package staticFinal;

public class WellsFar {
	static final String bankName="WellFarg";
	String name;
	int acctNum;
	// if a method is referencing non-static member
	// it should be non-static
	/// for all other sceanrio make it static
	public static void test1() {
		System.out.println( bankName   );
	}
	// non-static member can call EVERYONE
	public void test2() {
		System.out.println(   name );// non static variable
		System.out.println( bankName );// static variable
		test3(); // static method
		test4(); // non-static method
	}
	// static member can call only other static member
	public static void test3() {
		System.out.println( bankName );// static variable
		test1(); // static method
	}
	public void test4() {
		System.out.println(name);
	}
	public WellsFar(String n, int a) {
		name=n;
		acctNum=a;
	}

}
