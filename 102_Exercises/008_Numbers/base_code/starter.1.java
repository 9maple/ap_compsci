/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	String word = sc.nextLine();
	while(true){
		if(word.equals("pizza")){
			System.out.print("You got it!");
			break;
		}
		word = sc.nextLine();
		}

	}
}
