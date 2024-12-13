/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		int secret = (int)(Math.random()*1000);
		
		while(true){
			System.out.print("Guess a number: ");
			int guess = sc.nextInt();
			if(guess==secret){
				System.out.print("You guessed it!");
				break;
			}
			if(guess>secret){
				System.out.println("You're too high!\n");
			}
			if(guess<secret){
				System.out.println("You're too low!\n");
			}
		}
	}
}
