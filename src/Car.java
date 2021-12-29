public  class Car {
	//access privilege : broader ( private < default < protected < public  )
	protected  void drive() {
		System.out.println("basic speed");
	}
	public void drive(String s) {
		System.out.println("john basic speed");
	}
}
