package string;

public class Testing {

	public static void main(String[] args) {
		String email="john@g.com";
		// indexOf("o") = 1
		// lastIndexOf("o")= 8
		if( email.contains("@")  == true && 
				email.endsWith(".com")==true &&
				email.indexOf("@") != 0
				)
			System.out.println("email is valid");
		else
			System.out.println("email is invalid");
		
		String s1="john";
		String s2="john";
		String s3=new String("JOhn");
		String s4=new String("john");
		if(s1.equals(s2))
			System.out.println("s1 an s2 are same");
		else
			System.out.println("s1 an s2 are different");
		
		if(s1.equalsIgnoreCase(s3))
			System.out.println("s1 an s3 are same");
		else
			System.out.println("s1 an s3 are different");
		
		String n="john doe";
		System.out.println( n.substring(5) );// doe
		System.out.println( n.substring(2,6) ); // hn d
		// start from index 2
		// till index 6(not including 6)
		System.out.println( n.toUpperCase() );
		System.out.println( n.toLowerCase());
		
		String ss="   john doe  ";
		System.out.println( ss );
		System.out.println( ss.trim() );
		
	}

}
