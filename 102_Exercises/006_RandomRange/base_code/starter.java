/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random numbers");
		System.out.print("Please enter an integer: ");
		int first = sc.nextInt();
		System.out.print("Please enter another integer (bigger than the first): ");
		int second = sc.nextInt();
		System.out.println(" ");
		System.out.println("You range is " + first + " to " + second + ".");
		System.out.println("Here are 5 numbers generated in that range.");
		int a = (int)(Math.random()*(second-first)+first);
		int b = (int)(Math.random()*(second-first)+first);
		int c = (int)(Math.random()*(second-first)+first);
		int d = (int)(Math.random()*(second-first)+first);
		int e = (int)(Math.random()*(second-first)+first);
		System.out.print(a+", "+b+", "+c+", "+d+", "+e);
	}
}
