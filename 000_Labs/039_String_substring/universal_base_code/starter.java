/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a word");
		String input = sc.nextLine();
		int length = input.length();
		input.substring(input.length());
		int outputTimes = 0;
		int x = 0;
		int y = 1;
		while (outputTimes < length){
			System.out.println(input.substring(x,y));
			x++;
			y++;
			outputTimes++;
		}

		
	}
} 