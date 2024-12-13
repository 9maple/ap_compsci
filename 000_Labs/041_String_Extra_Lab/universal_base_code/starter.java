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
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a sentence:");
		String x = sc.nextLine();
		
		String result = "";
		
		for(int i = 0; i< x.length(); i++){
			
			int space = x.indexOf(" ");
			String word = x.substring(0, space);
			
			x = x.substring(space + 1);
			result = " " + word + result;
			
			if(x.indexOf(" ") == -1){
				result = x + result;
				break;
			}
		}
		
		System.out.println(result);

	}
}
