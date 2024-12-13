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
	int x = (int)(Math.random()*1000);
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Pick a number between 1 - 1000: ");
	int y = sc.nextInt();
	
	if(x != y && x > y){
		System.out.println("Your number wasn't the random number.\nYour number was smaller than the random number. The number was " + x);
	}
	
	else if(x != y && x < y){
		System.out.println("Your number was bigger than the random number. The number was " + x);
	}
	
	else{
		System.out.print("You guessed the random number! Congrats!");
	}
	}
}
