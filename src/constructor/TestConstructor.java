package constructor;

public class TestConstructor {

	public static void main(String[] args) {
// number of input and order of input		
 		Car customer1=new Car(111);		
		Car customer2=new Car("green", 124);		
		Car customer3=new Car("red", 2, 125);		
		
		System.out.println( customer1.color );
		System.out.println( customer2.color );
		System.out.println( customer3.color );
	}

}
