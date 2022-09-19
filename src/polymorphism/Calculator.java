package polymorphism;

public class Calculator {
	
	public int add(int a, int b) {
		return a+b;
	}
	/*
	 * overloading.. compile time polymorphism
	 1) method names should be similar
	 2) input has to be different
	in the same class or parent-child class
	 */
	public int add(int a, int b,int c) {
		return a+b+c;
	}
	
	public String add(String a, String b) {
		return a+b;
	}
	public float add(float a, float b) {
		return a+b;
	}
}
