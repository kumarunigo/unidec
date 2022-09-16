package inheritance;

public class TestInterface {

	public static void main(String[] args) {
		// you cannot create objects of
		// incomplete programs
		ICar ic=new ICar(); // 100% incomplete(interface) 
		Nissan ni=new Nissan();// partial (abstract)
		AdvancedNissan an=new AdvancedNissan();
		
		// equal assignment NEW RULE
		// LHS and RHS should be same 
		int a=10;
		int b=20;
		a=b;
		// RHS can be concrete/complete Child of LHS 
		ICar i1=new Nissan();
		ICar i2=new AdvancedNissan(); // AdvancedNissan is child of ICar.. it is complete
		Nissan n=new ICar(); // ICar is incomplete as well as ICar is parent of Nissan
		Nissan n2=new AdvancedNissan(); // AdvancedNissan is child of Nissan.. it is complete
		
		
	}

}
