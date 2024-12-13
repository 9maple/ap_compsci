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
		
		for(int x = 0; x<arr.length; x++){
			arr [x] = (int)(Math.random()*1000);
			System.out.println(arr [x]);
			
		}


		
	}
}
