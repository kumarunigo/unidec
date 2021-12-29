package array;

public class ArrayTest {

	public static void main(String[] args) {
		// initialization
		FBCustomer cust1=new FBCustomer(); // var created & constructed
		FBCustomer cust2=new FBCustomer();
		//declration
		FBCustomer cust3; // var created... null
		FBCustomer cust4; // var created... null
		
		// arra declration
		FBCustomer[] allCustomers=new FBCustomer[1000000];
		for(int i=0; i<allCustomers.length ; i++)
			allCustomers[i]=new FBCustomer();
		
		// for-each... enhanced for loop
		for(FBCustomer temp  :   allCustomers)
			temp=new FBCustomer();
		
		// nested loop
		FBCustomer[][] nestedCustomers=new FBCustomer[4][3];
		for(int i=0; i<=3 ; i++)
			for(int j=0; j<=2 ; j++)
				nestedCustomers[i][j]=new FBCustomer();
		/*
		i=0, j=0
		i=0, j=1
		i=0, j=2
		i=1, j=0
		i=1, j=1
		i=1, j=2
		i=2, j=0
		i=2, j=1
		i=2, j=2
	
		*/
			
		System.out.println(  allCustomers[2]  );
		
		
		int [] scoreA= { 67,88,23,12 };
		String[] names= { "john","jane","mike"};
		System.out.println( scoreA[1]   );
		System.out.println( names[2]   );
		
		int [] source= { 10,20,30,40,50 };
		int [] destin= new int[5];
		
		System.arraycopy(source,1,destin, 2, 3);				
		for(int i : source)
			System.out.println(i);
		
		System.out.println("*******");
		for(int i : destin)
			System.out.println(i);
		
		
		
		
		
	}

}
	