package excception;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
	
	// - 2 billion to + 2 billion
	int balance=-20;
	long abc=12;
	
	public void method1() {
		System.out.println("in method1");
		try{
			method2(); // calling method2
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void method2() throws IOException {
		System.out.println("in method2");
		method3(); // calling method3
		
	}
	public void method3() throws IOException {
		System.out.println("in method3");
		String [] names=new String[4]; // array = group of 4 names
		File f=new File("E:/java.txt");
		
		int i=10/0; // arithmetic exception(Runtime exception)
	
		System.out.println( names[7]  ); // trying to print 8th name that doesnot exists .. array exception (Runtime exception)
		
		// method3 programmer has 2 choice
		// 1) handle possible failure yourself = surrouding below line with try and catch block
		// 2) let caller handle the failure. declare throws on method declaration line
		f.createNewFile(); // create new file in location. E drive... named java.txt
					// File exception - CHECKED EXCEPTION
		
		
	}
}
