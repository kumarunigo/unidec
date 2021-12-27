
public class Operator {
	public static void main(String argsp[] )
	{
		int a;// delcaration
		int b=20; // initialization
		b=30; // assignment
		System.out.println("hi"); // method call
		
		int x=21;
		int y=10;
		int z= x % y;
		System.out.println( z );
		Person p=new Person(); // p #abc, john
		Person p2=new Person(); // p2 #pqr john
		p.name="jane";
		p2=p; // p2 #abc
		System.out.println( p == p2   );
		
		int q=20;
		int r=20;
		
		System.out.println(     q >= r     );
		
		int s= -10;
		// + - 10
		System.out.println(      +(s)   );
		
		int t =20;
		System.out.println(  ++t  );  // t=22 ...  print 22 // PRE
		System.out.println( --t ); // t=21... print 21
		System.out.println( t++ );// print 20.. t=21
		System.out.println( t );
		System.out.println( t-- );// print 21... t=20
		System.out.println(  t++  ); // print 20... then t=21 // POST
		
		
		boolean u=false;
		System.out.println(  !u  );
		
		int aa=10;
		int bb=20;
		int cc=30;
		int dd=40;
		boolean res=(aa==bb) || (cc != dd);
		System.out.println( res );
		
		System.out.println( 5 & 4);
		System.out.println( 5 | 4);
		System.out.println( 5 ^ 4);
		System.out.println( (4 + 5 * 3 ) > ( 6 + 4 - 3)  && ( 3 * 2 + ( 2+4) ) > 20);
	}
}
