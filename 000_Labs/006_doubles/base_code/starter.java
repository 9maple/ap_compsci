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
		System.out.print("Please enter a temperature in Farenheit: ");
		int Farenheit = sc.nextInt();
		System.out.println("Here is the temperature in Celsius: " + (Farenheit-32)*0.555);
	}
}
