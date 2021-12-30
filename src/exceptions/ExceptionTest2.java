package exceptions;

public class ExceptionTest2 {
	static Person p=new Person();
	public static void main(String[] args) {
		try {
			int i=10/2;
			System.out.println(p.name);
			String [] arr=new String[4];
			System.out.println(  arr[3]  );
		}
		catch( ArithmeticException ae) {
			System.out.println(" dividing by zero is infinity. int cannot store infinit values");
			ae.printStackTrace();
		}
		catch(NullPointerException npe) {
			System.out.println(" variable should be initialized before applying dot operator");
			npe.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ao) {
			System.out.println("array index should be between range of 0 to size - 1");
			ao.printStackTrace();
		}
		catch(RuntimeException re) {
			System.out.println(" variable should be initialized before applying dot operator");
			re.printStackTrace();
		}
		catch( Exception ae) {
			System.out.println(" dividing by zero is infinity. int cannot store infinit values");
			ae.printStackTrace();
		}
		catch(Throwable t) {
			t.printStackTrace();
		}
		
		finally {
			System.out.println("thank you");
		}
		}

}
