package collection;

// inherits Object > student
// Iphone3 > IphoneX
public class Student implements Comparable<Student> {
	public int grade;
	public String name;
	public int rollNumber;
	public Student(int g, String n,int r) {
		grade = g;
		name = n;
		rollNumber = r;
	}
	// categorizing
	public int hashCode() {
		return grade;
		//return 1;
	}
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", name=" + name + "]";
	}
	// search for duplicates
	public boolean equals(Object o) {
		Student anotherStudObject=(Student)o;
		if(this.name.equals(anotherStudObject.name)
				&&
				this.rollNumber==anotherStudObject.rollNumber
				&&
				this.grade==anotherStudObject.grade
				)
			return true;
		else
			return false;
	}
	@Override
	public int compareTo(Student o) {
		int res= this.name.compareTo(o.name) ;
		res= res + (( this.grade - o.grade) *100);
		return res;
	}
}
