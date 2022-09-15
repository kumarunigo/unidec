package inheritance;
// multiple inheritance is blocked = Due to diamond problem
public class Child extends Parent { // 3 global variable, 3 mmethods
	int b=20;
	int abcd=20;
	public int sub( int t, int u) {
		int abcd=30;
		System.out.println( super . abcd );
		return t-u;
	}
	/*
	 super()  = call my parents constrcutor
	 super.abcd = access my parents global variable
	 super.add(10,20) = access my parents method add
	 */
	public Child() {
		super(  ); // go to my parent constructor that has 0 input
		System.out.println("constructing child");
		
	}
}
