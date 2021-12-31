package threads;

public class MainWait {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main entered");
		
		ProgramA pa = new ProgramA();
		pa.start();
		
		//pa.join();// indefinite waiting.. wait till other pa thread is completed
		//pa.join(5000);// timed waiting.. 1000 millisecond = 1 second
		System.out.println("main program goinng to sleep");
		Thread.currentThread().sleep(5000);
		System.out.println("main program woke up");
		System.out.println("main stopped");
		pa.stop();// forcefully shutdown thread
	}

}
