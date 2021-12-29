package group.a;
public class ParentA {
	protected ParentA() {
		
	}
	
	public int a=10; // ANYONE from ANYWHERE can access this variable
	int b=20;			// default access... ANY programs in the same package/group
	protected int c=30; // ANY programs in the same package/group OR ANY program Inheriting from different package
	private int d=40; // NO ONE outside this program can access
	protected void add(int a,int b) {	
	}
}