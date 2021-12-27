public class Customer {
	public static void main(String[] args) {
		Bank b=new Bank();
		LoanApplication l=new LoanApplication();
		b.loanProcessor (  l );
		System.out.println( l.customerRisk);
		System.out.println( l.loanApproved );
	}
}