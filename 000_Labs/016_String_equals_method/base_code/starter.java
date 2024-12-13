/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Would you like to be a Wizard, Warrior, or Rogue?: ");
	String x = sc.nextLine();
	
	if(x.equals("Wizard") || x.equals("wizard")){
		System.out.println("You have chosen the Wizard! Excelsior!"); 
	}
	
	else if(x.equals("Warrior") || x.equals("warrior")){
		System.out.println("You have chosen the Warrior! For honor!");
	}
	
	else{
		System.out.println("You've decided not to choose a role. Rerun the program :(");
	}
	}
}
