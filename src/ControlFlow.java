import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
			int pin=20;
			int enteredPin=20;
			boolean c=true;
			int invalidAttempt=0;
			if (  pin == enteredPin ) {
				System.out.println("pin matches.. welcome");
			}
			else {
				invalidAttempt++;
				System.out.println("invalid pin. please try again later");
			}
			
			int choice=3;
			if(choice == 1) {
				System.out.println("customer chose withdraw");
			}
			else if(choice == 2) {
				System.out.println("customer chose deposit");
			}
			else if(choice == 3) {
				System.out.println("customer chose check balnace");
			}
			else{
				System.out.println("invalid input");
			}
			
			choice++;
			
			// print all odd numbers between 1 and 20
			// {} block = group of lines
			for (int i =0 ; i < 5 ; i++ )
			{
				System.out.println("hi");
				if(i==2) {
					break;
				}
				System.out.println("hello");
			}
			

			System.out.println( "bye bye ");
			
			// shopping example... while loop
			
			Scanner sc=new Scanner(System.in);
			System.out.println( " do you want to shop");
			boolean shop=sc.nextBoolean();
			while(shop) {
					System.out.println( " press 1 to add2cart 2 to checkout");
					int cho=sc.nextInt();
					if(cho==2)
						shop=false;
			}
			
			System.out.println("thank you for shopping");
			
			
			int registeredPin=1234;
			System.out.println("welcome to java bank");
			System.out.println("enter your pin");
			int enterdPin=sc.nextInt();
			if( registeredPin == enterdPin) {
				do {
					System.out.println("press 1 for deposit, 2 for exit");
					int choi=sc.nextInt();
					if(choi == 1)
						System.out.println("deposit succesfull");
					else
						break;
				}while(true);
				System.out.println("thank you for using java bank");
			}
			else {
				System.out.println("invalid pin");
			}
			
			int choicee=1;
			switch(choicee){
				case 1:
					System.out.println("customer chose withdraw");	
					break;
				case 2:
					System.out.println("customer chose deposit");
					break;
				case 3:
					System.out.println("customer chose check balance");
					break;
				default:
					System.out.println("invalid input");	
					break;
			}
			
	}

}
