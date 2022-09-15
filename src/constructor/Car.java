package constructor;
public class Car {
	String color="white";
	int vin=123;
	int door=4;
	// polymorphism - overloading
	/// method
	public Car(int v) {
		vin=v;
	}
	public Car(String c, int v) {
		color=c;
		vin=v;
	}
	public Car(int d, int v) {
		door=d;
		vin=v;
	}
	public Car(String c,int d, int v) {
		color=c;
		vin=v;
		door=d;
	}
	
	
	
	public void test(int a) {
		
	}
}
