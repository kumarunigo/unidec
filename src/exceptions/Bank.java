package exceptions;

public class Bank {
	int balance=100;
	public void withdraw(int amount) throws InsufficientFundException {
		if(balance < amount)
			throw new InsufficientFundException("you cannot withdraw :"+amount+" when your balanace is :"+balance);
		else
			balance=balance-amount;
	}
}
