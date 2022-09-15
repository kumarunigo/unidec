package methods;

public class Accountant {
	 
	public static void main(String[] args) {
		// method call
		// 1 program is using the service provided by
		// another program
		Calculator cal=new Calculator();
		// calling method from outside program 
		// use reference followed by  . followed by service name  
		// cal.sub
		int x=20;
		String y="jane";
		int result=cal.sub(  x, 40 , y); 
		System.out.println(result);
		// method call rules
		/*
		 1) number of input should match
		 2) data type of input should match
		  Similar rules as seen in return statement
		 	if primitive data type is required = give/pass literal value or matching variable
		 	if complex data type is required = give/pass matching variable
		 3) order of input should match
		 
		 handling return type
		 when other program returns output
		 this program has to handle it
		 have a variable on LHS that matches with service method
		 output type
		 */
	}

}
