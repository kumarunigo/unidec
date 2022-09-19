package polymorphism;

public class Nissan extends Car{
	// overriding... runtime polymorphism
	// 1) it happens between parent and child
	// 2) method signature should be similar
	public void drive() {
		System.out.println("luxury car nissan");
	}
	
}
