package polymorphism;

import java.util.Scanner;

public class TestPoly {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int x=cal.add(10, 20);
		System.out.println("Enter 1 for basic, 2 for luxury,3 for economy,4 for fast, 5 for electric");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		if(option ==1) {
			Car car=new Car();
			testDrive(car);
		}
		else if(option==2) {
			Nissan n=new Nissan();
			testDrive( n );
		}
		else if(option==3) {
			Toyota t=new Toyota();
			testDrive( t );
		}
		else if(option==4) {
			Ferrari f=new Ferrari();
			testDrive( f );
		}
		else if(option==5) {
			Tesla tes=new Tesla();
			testDrive( tes );
		}
		
		
	}
	// method call new rule
	// you can pass a variable of same data type.
	/// or child of Car data type
	public static void testDrive(Car c) {
		c.drive(); // runtime polymorphism
		// during runtime... whichever data type u pass, that method is called
	}

}
