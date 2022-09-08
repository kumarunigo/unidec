package references;

public class Variable {

	public static void main(String[] args) {
			int a=10;
			a=5; // literal value
			int b=20;
			b=30;
			int c=30;
			c=a; // LHS = RHS
			String p="john";
			String q="jane";
			int x=20;
			int y =30;
			p=q;
			// String = String
			y=x;
			// int = int
			x=p; 
			// int = String
			
			boolean s=true;
			String t="ancd";
			int u=123;
			double v=123.1;
			u=255;
			u=x;
			t=y;
			
					// RHS can be any matching literal value
					// RHS can be any matching variable
					
	}

}
