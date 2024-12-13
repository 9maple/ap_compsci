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
		System.out.print("Please enter a name: ");
		String name = sc.nextLine();
		System.out.print("How many times would you like this name to be repeated? ");
		int x = sc.nextInt();
		int count = 0;
		while(count!=x){
			System.out.println(name);
			count++;
		}



		
	}
}
