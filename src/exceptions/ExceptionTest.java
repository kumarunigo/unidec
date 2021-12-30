package exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
	
	static Person p;
	
	public static void main(String[] args) {
		Bank b=new Bank();
		try {
			b.withdraw(500);
		} catch (InsufficientFundException e) {
			e.printStackTrace();
		}
		 //MethodCall4 m4=new MethodCall4();
		// m4.exc();
	}

}
