package threads;

public class MainProgram {
// sequential programming
	public static void main(String[] args) {
		System.out.println("main entered");
		ProgramA pa = new ProgramA();
		pa.start();

		ProgramB pb = new ProgramB();
		Thread t=new Thread( pb);
		t.start();
		
		ProgramC pc = new ProgramC();
		pc.start();


		ProgramD pd = new ProgramD();
		pd.start();
		

		ProgramE pe = new ProgramE();
		pe.start();
		
		pa.setPriority(Thread.MAX_PRIORITY);
		pc.setPriority(Thread.MIN_PRIORITY);
		
		long i=0;
		while(true) {
			i++;
			if(i%1000000000 ==0)
				System.out.println("Main program counted a "+i);
			if(i==5000000000l)
				break;
		}
		
		System.out.println("main ended");
	}

}
