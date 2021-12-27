public class MethodCall3 {
	public static void main(String[] args) {
		MethodCall4 m4=new MethodCall4();
		int x=30;
		Person per=new Person();//#abc=john
		per=m4.test(   per,x   );// #pqr 
		System.out.println(per.name);
		System.out.println( x );
	}
}