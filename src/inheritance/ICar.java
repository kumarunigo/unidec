package inheritance;
// abstract = incomplete program
// concrete = complete program
// abstraction - oops fundamental
// hiding internal complex implementation(code) details
public  abstract interface ICar {
	int a=10; // final = unchangeable
	public abstract void drive();
	public void start();
	public void stop();
	default void music() {
		System.out.println(" playing music ");
	}
	
}
