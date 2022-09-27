package excception;

public class Bank {
	int balance=100;
	public void withdraw(int amt) throws InsufficentException {
		if(balance < amt)
			throw new InsufficentException(" you have low balance");
		
		balance=balance-amt;
		System.out.println("new balance is "+balance);
	}
}
