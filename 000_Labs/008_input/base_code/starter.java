/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?");
		String name = sc.nextLine();
		System.out.println("What is your age?");
		String age = sc.nextLine();
		System.out.println("What month were you born?");
		String month = sc.nextLine();
		System.out.println("What day were you born?");
		String day = sc.nextLine();
		System.out.println("What year were you born?");
		String year = sc.nextLine();
		System.out.println("How much is a buck fifty?");
		double money = sc.nextDouble();
		System.out.println("Your name is " + name + " and you were born on " + month +"/" + day + "/" + year + ".");
		System.out.println("You are " + age + " years old!!!!");
		System.out.print("You have $" + money + " in your wallet.");
		
	}
}
