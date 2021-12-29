package staticFinal;

public class TestStatic {

	public static void main(String[] args) {
		
		WellsFar.test1();
		System.out.println(WellsFar.bankName);
		WellsFar cust1=new WellsFar("john",123);
		WellsFar cust2=new WellsFar("jane",124);
		cust1.bankName="abcd";	

	}

}
