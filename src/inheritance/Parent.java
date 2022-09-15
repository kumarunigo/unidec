package inheritance;
public class Parent extends GrandParent{ // 2 global variable, 2 methods
	int a=10;
	int abcd=10;
	public int add( int r, int s) { // input variables
		a=20;
		a=30;
		a=40;
		return r+s;
	}
	public Parent() {
		super();// super=parent... super()=GrandParent()
		System.out.println("constructing parent");
	}
	
}
