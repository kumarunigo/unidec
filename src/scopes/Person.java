package scopes;

public class Person {
		// Global : variable out side the method : long term information
		static String species="human";// static variable : information shared between each instance
		String name; // instance variable : information specific to each instance
		int age=10; // numeric data type =0, decimal data= 0.0, bool=false, object = null
		//int age;
		// Rule : global variables have default values
		// Rule : no duplicate allowed in global level
		// Rule : conflict allowed between global and local = local has preference
		
		// local variable : short term information
		// method declaration line : Parmetric variable
		public void test(int a) {
			// Rule : NO conflict allowed between parametric and local
			int q;
			q=10;
			q=20;
			System.out.println( name );
			System.out.println( a );
			// method body
			int b=20; // local variable : within same method ONLY
			// int b;
			// Rule : local variables do not have default values
			System.out.println( b ); // sysout - print "value" of a variable
			System.out.println( age );
			int age=30;
			System.out.println( age ); // 30
			System.out.println( this.age ); // 10
		}
		
		public void test2() {
			System.out.println(  name );
			System.out.println( age );
			System.out.println( b );
			System.out.println( a );
		}
		// 10 + 15 + 20 : input (parametric variables0
		// 25 + 20 ( temprory local variable)
		// 45
		
		public void test3( int x) {
			System.out.println( x );
			
			{
				int y=20; // from the line it was declared  till the end of the block
				// what is the opening block of y variable = look at opening block before this line
				{
					{
						System.out.println(  y );	
					}
				}
			}
			
			int y=30;
			System.out.println(  y );
			System.out.println( x );
		}
		
		public void test4(  ) {
			System.out.println(  x );
			System.out.println(  y );
		}
		
		
}
