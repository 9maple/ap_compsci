/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your first number: ");
		int a = sc.nextInt();
		System.out.print("Please enter your second number: ");
		int b = sc.nextInt();
		System.out.print("Please enter your third number: ");
		int c = sc.nextInt();
		
		if(a>b && a>c){
			System.out.println("Your first number is the largest of the three!\nThe number was " + a);
		}
		
		if(b>a && b>c){
			System.out.println("Your second number is the largest of the three!\nThe number was " + b);
		}
		if(c>a && c>b){
			System.out.println("Your third number is the largest of the three!\nThe number was " + c);
		}
		
		if(a<b && a<c){
			System.out.println("Your first number is the smallest of the three!\nThe number was " + a);
		}
		
		if(b<a && b<c){
			System.out.println("Your second number is the smallest of the three!\nThe number was " + b);
		}
		
		if(c<a && c<b){
			System.out.println("Your third number is the smallest of the three!\nThe number was " + c);
		}
	}
}
