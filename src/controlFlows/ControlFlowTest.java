package controlFlows;

import java.util.Scanner;

public class ControlFlowTest {

	public static void main(String[] args) {
		/*
		 * only IF.... IF-ELSE...... IF-ELSEIF-ELSEIF-ELSE if ( boolean condition ){
		 * piece of code to be run if condition above is true } else if ( if first
		 * boolean condition is failed... try this boolean condition next){ piece of
		 * code to be run if condition above is true } else{ default peice of code if
		 * both above are failed... this is the default code }
		 */
		System.out.println(" program start");
		int number = 2;
		// if( condition )
		// condition = boolean variable
		// operaotr with boolean output : > , < , == , != , &&, ||
		boolean a = true;
		if (a) {

		}
		if (1 < 2 && 3 > 2) {

		}

		if (number == 1) { // if( false )
			System.out.println(" the number is 1");
		}
		// no code should be written between this if-else chain
		else if (number == 2) { // else if(true)
			System.out.println(" the number is 2");
		} else if (number == 3) {
			System.out.println(" the number is 3");
		} else {
			System.out.println(" unknown number");
		}
		System.out.println(" program ends ");
		// if you enter one of the block above... then u cant enter another block in
		// this chain

		int x = 10;
		int y = 20;
		// block - group of line
		if (x == y)
			System.out.println("x is equal to y");
		else if (x > y)
			System.out.println("x is greater to y");
		else
			System.out.println("x is lesser to y");
		// never ever end if else block with a semicolon
		// semicolon are treated as empty blocks

		int z = 30;
		if (z > 50) {

		}

		System.out.println(" z is greater than 50");

		for (int i = 1; i < 5; i++) {
			System.out.println(" hi ");
			if (i == 3)
				break;
			System.out.println(" bye");
		}
		// system.out = prints OUTPUT on the screen
		// system.in = take INPUT from the screen
		Scanner sc = new Scanner(System.in);
		System.out.println(" do you want to add item to cart ?");
		boolean customerChoice = sc.nextBoolean();
		// 0 or more loop
		while (customerChoice) {
			System.out.println("added item to cart");
			System.out.println(" do you want to add another item to cart ?");
			customerChoice = sc.nextBoolean();
		}
		// 1 or more
		do {
			System.out.println("bank transaction completed");
			System.out.println("do you have any other bank transcation to process ?");
			customerChoice = sc.nextBoolean();
		} while (customerChoice);

		int numbers = 10;
		switch (numbers) {
			case 1:
				System.out.println(" number is 1");
				break;
			case 2:
				System.out.println(" number is 2");
				break;
			case 3:
				System.out.println(" number is 3");
				break;
			case 4:
				System.out.println(" number is 4");
				break;
			default:
				System.out.println(" unknown number ");
				break;
		}

	}

}
