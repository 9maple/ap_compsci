/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int arr [] = new int [20];
		int x = 0;
		
		System.out.println("These are the 20 numbers");
		
		while(x<arr.length){
			arr [x] = (int)(Math.random()*10 + 1);
			System.out.print(arr [x] + " ");
			x++;
		}
		
		int target = (int)(Math.random()*10 + 1);
		
		System.out.println(); 
		System.out.println();
		
		System.out.println("The random number to look for is " + target); 
		
		int duplicateCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == target) {
                System.out.println("Duplicate found at index " + i);
                duplicateCount++;
            }
        }
        
		System.out.println("Total number of duplicates: " + duplicateCount);
		
        System.out.println(); 
       
        int consecutiveCount = 0; 
        System.out.println("Looking for two in a row:");
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("Two in a row at indexes " + i + " and " + (i + 1));
                consecutiveCount++;
            }
        }
      
        if (consecutiveCount == 0) {
            System.out.println("No consecutive duplicates found.");
        }
	}
}
