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
		
		int amt = (int)(Math.random()*151+51);
		int [] emma = new int [amt];
		
		for(int x = 0; x < emma.length; x++){
		emma[x] = (int)(Math.random()*101+1);
		System.out.println(emma [x]);
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < emma.length; i++){
			if(emma[i] < min){
				min = emma[i];
			}
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < emma.length; i++){
			if(emma[i] > max){
				max = emma[i];
			}
		}
	
		
		
		for (int i = 0; i < emma.length; i++) {
    		int sum;
			double avg;
		
    		sum = sum + emma[i];
    		avg = sum / emma.length;
    		
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("There are " + amt + " values");
		System.out.println("The minimum value is " + min);
		System.out.println("The maximum value is " + max);
		System.out.println("The average of the values is " + avg);
		
		
	}
}
