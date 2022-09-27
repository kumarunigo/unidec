package excception;

public class TestUserDefinedExce {

	public static void main(String[] args) {
		Bank b=new Bank();
		try {
			b.withdraw(120);
		} catch (InsufficentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
