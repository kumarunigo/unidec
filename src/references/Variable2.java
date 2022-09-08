package references;

public class Variable2 {

	public static void main(String[] args) {
		int x=20;
		int y=30;
		System.out.println( x  ); // print output from our program
		x=25;
		System.out.println( x  );
		x=y; // if variable present on RHS... substitute value of that variable
		// x=30;
		System.out.println( x );
	}

}
