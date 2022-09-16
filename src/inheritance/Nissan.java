package inheritance;
// implementing class has a responsbility
// complete or abstract/incomplete code from
// its parent ICar
// If a Class decides to implement an interface
// 1) write the code for alll those methods
// 2) declare this class as abstract(incomplete)
public abstract class Nissan implements ICar{
	public void drive() {
		System.out.println(" driving car");
	} 
	public void start() {
		System.out.println("starting car");
	} 
	
}
// inherited - 3 incomplete methods
// 2 complete methods... 1 incomplete methods
