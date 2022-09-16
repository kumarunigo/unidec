package inheritance;

public interface IParent2 {
	// liberal parent
	// no conflict to child since no code for job provided
	public void job();
	public void play();
	default void sleep() {
		System.out.println("sleeping 8 hrs");
	}
}
