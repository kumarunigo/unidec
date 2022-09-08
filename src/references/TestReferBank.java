package references;

public class TestReferBank {

	public static void main(String[] args) {
		BankAccount john=new BankAccount();	
		BankAccount jane;	
		jane=john;	 // jane=#123
			
		System.out.println( john.balance );	
		System.out.println( jane.balance );	
		john.balance = john.balance - 20;	
		System.out.println( john.balance );	
		System.out.println( jane.balance );	

	}

}
