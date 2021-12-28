// abstract class = INCOMPLETE
// concrete class = COMPLETE
public interface ICalculator {
	
	// constant/final... unchangeable
	int testing=20;
	
	int add(int a,int b);
	abstract int sub(int a,int b);
	public int mul(int a,int b);
	public abstract int div(int a,int b);
	default void test() {
		System.out.println("do that");
	}
}
