package inheritance;
public class GrandParent { // 1 global variable, 1 method
	int x=30;
	public int mul(int p, int q) {
		return p*q;
	}
	public GrandParent() {
		System.out.println("constructing grandparent ");
	}
}
