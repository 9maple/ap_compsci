/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your dog's name?: ");
		String name = sc.nextLine();
		
		System.out.print("How old is " + name + "?: ");
		int age = sc.nextInt();
		
		Dog one = new Dog(name, age);
		
		Dog two = new Dog("Maple", "Mutt");
		
		if(one.isSleeping()){
			System.out.println(name + " is sleeping!");
			
			if(two.isSleeping()){
				System.out.println(two.getName() + " is sleeping");
			}
			
			else{
				System.out.println(two.getName() + " is awake");
			}
		}
		else{
			System.out.println(name + " is awake");
			one.bark();
			
			if(two.isSleeping()){
				System.out.println(two.getName() + " hears " + one.getName() + "!");
				two.bark();
			}
			
			else{
				System.out.println(two.getName() + " is awake!");
				two.bark();
			}
		}
		


	}
}
