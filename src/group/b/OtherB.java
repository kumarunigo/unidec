package group.b;
import group.a.ParentA;
public class OtherB {
	public void method() {
		ParentA par=new ParentA();
		System.out.println(  par.a  );
		System.out.println(  par.b  );
		System.out.println(  par.c    );
		System.out.println( par.d );
		par.add(1,2);
	}
}
