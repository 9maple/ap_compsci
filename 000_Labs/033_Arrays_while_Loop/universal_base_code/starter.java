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
		
		int [] arr = new int [1000];
		
		int x = 0;
		int c = 1;
		
		
		while(x<arr.length){
			arr [x] = (int)(Math.random()*100);
			System.out.println(c + ". " + arr [x]);
			c++;
			x++;
			
		}

		
	}
}
