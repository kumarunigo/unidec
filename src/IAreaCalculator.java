
public interface IAreaCalculator {
	public int areaOfSquare(int side);
	int add(int a,int b);
	default void test() {
		System.out.println("do this");
	}
	
}
