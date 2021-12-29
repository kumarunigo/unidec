package group.b;
import group.a.ParentA;
public class ChildB extends ParentA{
	public ChildB() {
		super();
	}
	public void method() {
		System.out.println( a  );
		System.out.println( b  );
		System.out.println( c   );
		System.out.println( d );
		add(1,2);
	}
}
