package exceptions;

public class InsufficientFundException extends Exception{

	public InsufficientFundException(String errorMessage) {
		super(errorMessage);
	}
}
