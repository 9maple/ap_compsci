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
		Scanner sc = new Scanner (System.in);
		System.out.print("What would you like your role to be?: ");
		String userRole = sc.nextLine();
		

		BaseClass em = new BaseClass(userRole);
		BaseClass me = new BaseClass(userRole);
		me.myToString();

		
	}
}
