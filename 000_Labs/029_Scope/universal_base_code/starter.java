/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		String statement; 
		
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
		if(shrek.isUgly()){
			statement = shrek.name + " IS UGLY!";
		}
		System.out.println(statement);
		donkey.interact(shrek);
		for(int i = 0; i < 5; i++){
			shrek.interact(donkey);
		}
		System.out.println("That printed out " + i + " times");

	}
}
