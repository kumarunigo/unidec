
public class MethodCall2 {
		public static void main(String args[]) {
			MethodCall1 m1=new MethodCall1();
			int p=20;
			String q="john";
			float r=10.0f;
			int result=  m1.test1(   p, q    ) ;
		}
}
/*
 1) pass equal amount of input		
2) Pass input that match data type		
	If callee need primitive input - you can pass variable of same type or literal value	
	If callee need complex/Object input - you can pass variable of same type	
3) Pass input in the same order		
4) handle return type/output from caller program in same type		
	add method returns "int"… Callee program stores output in "int" variable result	

 */
