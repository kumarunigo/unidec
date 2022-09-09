package variables;

public class Variable {

	public static void main(String[] args) {
		VariableTest vt=new  VariableTest();
		System.out.println(  vt . age );
		
		
		int a=10; // variable has to be declared first
		a=20;
		
		int age123$_; // variable name can contain alphabets numbers and $ _
		int _qwe1; // can start with special character
		int qwe1_;// can start with alphabet
		int 1qwe_;// cannot start with numbers
		
		int price;
		int bankBalance; // camel case... first letter of every word is capital case followed by lower case
		boolean isCustomerActive;
		int product_quantity;
		
		int c=10; // values should match the data type on LHS
		
		
		
	}

}
