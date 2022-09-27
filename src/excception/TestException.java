package excception;

import scopes.Person;

public class TestException {

	public static void main(String[] args) throws InsufficentException {
		
		TestException2 t2=new TestException2 ();
		t2.method();
		 try { // optional : if program fails, you will skip remaining line
			 ExceptionTest et=new ExceptionTest();
				et.method1();
				System.out.println("welcome to calculator software");
			 int x=100/2; // any number divided by zero = infinity
			 String [] names=new String[5];
			 System.out.println( names[7] );
			 Person p=new Person();
			 // any line that appears in try block after failure will be skipped
		 }
		 // optional : Only used when program fails
		 catch(ArithmeticException e) {// 
			 e.printStackTrace();
			 System.out.println("please do not try to divide a number by zero");
		 }
		 catch(ArrayIndexOutOfBoundsException ae) {
			 ae.printStackTrace();
			 System.out.println(" you can print array item within size declared");
		 }
		 catch(NullPointerException npe) {
			 
		 }
		 catch(Exception ae) {
			 ae.printStackTrace();
			 System.out.println("something went wrong");
		 }
		 // guaranteed
		 finally {
			 System.out.println("thank you for using calculator software");
		 }
		  
	}

}
