
public abstract class Calculat 
implements ICalculator,IAreaCalculator{
	public void test() {
		System.out.println(" do something else");
	}
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	// 2 concrete/complete methods
	// 3 abstract/incomplete methods
	// div,mul,area of square
}
