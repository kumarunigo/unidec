
public class StringTest2 {

	public static void main(String[] args) {
		String s1="john"; // literal, share the same object in pool
		 String s2="JOhn";
		 String s3=new String("john"); // new. created outside the pool
		 System.out.println( s1 );
		 System.out.println( s2 );
		 System.out.println( s3 );
		 // s3=s3.intern(); // intern sends address of similar string object from the POOL
		 // == compares address of both variables
		 // equals method compare values at both addresses
		 if(s1.equalsIgnoreCase( s2) )
			 System.out.println("s1 s2 are same");
		 else
			 System.out.println("s1 s2 are different");
		 
		 if(s1.equals(s3))
			 System.out.println("s1 s3 are same");
		 else
			 System.out.println("s1 s3 are different");
		  
	}

}
