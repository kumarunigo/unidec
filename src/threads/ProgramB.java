package threads;
import exceptions.Person;
public class ProgramB  extends Person implements Runnable {
	public void run() {
		System.out.println("Program B entered");
		long i=0;
		while(true) {
			i++;
			if(i%1000000000 ==0)
				System.out.println("program B counted a "+i);
			if(i==50000000000l)
				break;
		}
	}
}
