package operators;

public class Operators { // class/program block

	public static void main(String[] args) {// method block
// semicolon ending line.. statement
				int a; // declaration statement
				int b=10; // initialization
				b=30; // reassignment
				
				int sum=add(10,20); // method call
				{ // local block
					{
						
					}
				}
// assignment operator
			//	LHS = RHS
			// LHS = should always be a variable	
			// RHS = value, matching variable, expression, method call
			// RHS value is copied onto LHS variable	
				a=4;
				a=b; // a=30;
				a=10+30; // a=40;
				a=add(5,20); // a=25;
// arithemtic operator
			// LHS + RHS 
			// LHS and RHS should be numeric data type, int,byte,short,long,float,double
				int p = a + b; // a and b are numeric variable (int)
				p= 20 - 4; // 20 and 4 numerci values
				p = 20 * 4; // 80
				p=20 / 4; // 5
				p=21 % 4;// remainder/modulus 1
// equality operator - compare LHS and RHS
				// LHS == RHS
				// LHS and RHS can be any data type ,provided they are same.
				// recommendation = primitve data types only
				// output is boolean
				int h=10;
				int i=15;
				boolean j=true;
				boolean k=false;
				String l=new String("john");
				String m=new String("john");
				System.out.println(   l==m  ); //   false
				System.out.println(   j==k  ); // is 10 equal to 15... false
				System.out.println(   h!=i  ); // is 10 not equal to 15.... true
// relational operator - compare if a variabel is greater or smaller than another variable 
				// LHS and RHS can be used on numeric data type
				// output = boolean
				int n=20;
				int o=25;
				// > LHS is greater than RHS
				// < LHS is smaller than RHS.... 
				System.out.println(    n > o );// n(20) is greater than o(25).... false
				System.out.println(    n < o);// n(20) is smaller than o(25).... true
				int q=10;
				int r=10;
				System.out.println(    q >= r );// q(10) is either greater or equal to r(10)... true
				System.out.println(    q <= r);// q(10) is either smaller or equal to r(10)... true
// unary operator
				// used only on numeric data type
				int s=-5;
				System.out.println(   +s ); // + -5... -5... - - = + , + - = - , - + = -, + + = +
				
				// increment or decrement operator... ++   --
				int t=10;
				t++;
				t++;
				t--;
				t--;
				t--;
				System.out.println( t ); // 9
				// pre and post increment or decrement
				// pre increment/decrement = increment/decrement happens before the line
				// post increment/decrement = increment/decrement happens after the line
				
				int u=5;
				// u=6
				System.out.println(   ++u  ); // 6
				
				System.out.println(   u++  ); // 6
				// u =7
				
				System.out.println(   u--  );// 7
				//u=6
				// u=5
				System.out.println(   --u  ); // 5
				
				System.out.println(   u++  );//5
				//u=6
				
			// ! = negation operation
				// used only on boolean variable
				boolean v=true;
				System.out.println(   !v ); // false
				
// conditional operators are 
				// && = and..... || = or
				// LHS and RHS can be a boolean or equality/realtional operators
				// output is boolean
				int w=10;
				int x=11;
				System.out.println(     w==x   && w>x  ); // false
				//System.out.println(     10==11   && 10>11  );
				//System.out.println(     false   && false  );
				//System.out.println(     false   AND false  );
				System.out.println(     w<x   || w>x  );  // true
				//System.out.println(     10<11   || 10>11  );
				//System.out.println(     true   || false  );
				//System.out.println(     true   OR  false  );
// bitwise operator : bit = 1 or 0
				// & , | 
				System.out.println(   10 & 7 ); // 2
				System.out.println(   10 |  7 ); // 15
				System.out.println(   10 ^ 7 ); // 13 .. ex-or
				
				boolean z=  10 + 20 * 4 - 5 +( 2+ 3) > 2 && (10 + 2) > 3;
				System.out.println( z );
	}
// a=add(5,20); // a=25;
	public static int add(int x, int y) {
		int result= x+y; // return statement
		return result; // value of result is returned back.. 25
	}
}
