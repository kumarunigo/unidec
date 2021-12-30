package exceptions;

import java.io.File;
import java.io.IOException;

public class MethodCall4 {
	
	public void exc() {
		try {
			test(10);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void test(int a) throws IOException {			
		test2(); 		
	}			
	public void test2() throws IOException {	//#abc		
		test3();
	}			
	public void test3() throws IOException {
		File f=new File("X:/training/test.txt");
		f.createNewFile(); // compiletime/checked exception
		// throws : pass along exc handling to the caller
		// try-catch : do exp hand yourself
	}

	
}
