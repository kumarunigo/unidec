
public class Scope {
	String abcd="john"; // global variable ( static and instance variable)
	
	public void globalConflict( ) {
		System.out.println(abcd);
		int abcd=10;
		System.out.println(abcd);
		// local and global conflict = local preference
		System.out.println(this.abcd);
	}
	
	// input
	public int add(int a,int b, int c) { // parametric variable
		System.out.println(abcd);
		int x=a+b; // local variable
		int y=x+c;
		System.out.println(  abcd  );
		System.out.println( a );
		return y;
	}
	
	public void localScope() {
		{		 
			{
				int a=20; // scope / lifespan
				{
					{
						System.out.println( a  );
					}
				}
			}   
		}
	}
	public void test() {
		System.out.println(  abcd  );
	//	System.out.println( a );
	}
}
