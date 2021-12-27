public class ConstructorTest {
	public static void main(String[] args) {
		Person p1=new Person("jane");
		Person p2=new Person("mike",25);
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p1.age);
		System.out.println(p2.age);
		
	}
}
