public class Parent extends GrandParent{
	int age=40;
	public Parent(String s) {
		super();
		System.out.println("parent is born");
	}
	
	public int b=20;
	public void test(String s) {
		System.out.println("parent test");
	}
	public void occupation() {
		System.out.println("engineer");
	}
	public void pMethod() {
		System.out.println("in parent method");
	}
}
