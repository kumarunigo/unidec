package inheritance;

public interface IParent1 {
	// liberal parent
	// no conflict to child since no code for job provided
	public void job();
	public void eat();
	// backward compatibility... to avoid crashing
	// all child programs when a new method is added
	default void sleep() {
		System.out.println("sleeping 10 hrs");
	}
	
}
