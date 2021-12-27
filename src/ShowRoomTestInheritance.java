import java.util.Scanner;

public class ShowRoomTestInheritance {
	public static void main(String[] args) {
		Car c=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 for basic, 2 for nissna, 3 for toyota, 4 ferrari");
		int option=sc.nextInt();
		if(option==1)
			c=new Car();
		else if(option==2)
			c=new Nissan();
		else if (option == 3)
			c = new Toyota();
		else if (option == 4)
			c = new Ferrari();
		
		testDrive(c);
	}
	public static void testDrive(Car c) {
		c.drive(); // runtime polymorphism
	}
	
}
