package methods;

public class Calculator {
	int x=10;
	
	public int sub(int number1, int number2,String input3) {
		int su=number1-number2;
		return su;
	}
	
	
	
	// does-a
	// ADD
	/*
	 how to code methods :
			What to name this activity ??? addition
			how many inputs are required ??? what are the data type of each inputs ???
				2 inputs.... first input is int, second input is int
			how many outputs are required ??? what is the data type of each output ??? 
			   1 output... int 
			 IF
			 	output is 0 = void
			 	output is 1 = write data type of output
			 	output is more than 1= create complex data type program that has the sub-information
			 	
			 	input is 0 = blank
			 	input is 1= mention the data type and variable name
			 	input is more than 1 = mention dataype and variable names comma separated
	 */
	// primitive data type output
	public 	 int 	addition	(   int number1, int number2 ) {
		// return literal value that matches output data type
			// return 125;
		// return any variable that matches output data type
		int x=10;
		boolean y =true;
		String z="john";
		
		return x;
	}
	
	// complex/object/reference data type output
	public 	 AllMathResults 	calculateAllMathOperation(   int number1, int number2  ) {
		// return null... return empty complex data
		// return any variable that matches output data type
		int p=10;
		boolean q=true;
		String r="john";
		AllMathResults s=new AllMathResults();
		 return s;
	}
	
	public void charity(int donationAmount) {
		// dont write return statement if declared as void( meaning no output, 0 output)
	}
	
}
