
public class Bank {
	public void loanProcessor(LoanApplication la) {
		 if(la.loanAmount < 100000000)
			 riskAnalyzer(la);
	}
	public void riskAnalyzer(LoanApplication la) {
		if(la.salary > 50000) {
			la.customerRisk=false;
			managerApproval(la);
		}
	}
	public void managerApproval(LoanApplication la) {
		if(la.creditScore > 500)
			la.loanApproved=true;
	}
}
