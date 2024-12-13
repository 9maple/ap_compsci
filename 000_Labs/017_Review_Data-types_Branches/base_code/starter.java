/*
 *	Author: Emma Park
 *  Date: 9/25/24
 *  By the way I searched up the code for exiting the program 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
	System.out.println("What is your name?");
	String name = sc.nextLine();
		
	System.out.println("What is your title? Ex: Slayer of Dragons");
	String title = sc.nextLine();
		
	System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
	String x = sc.nextLine();
	if(x.equals("Wizard") || x.equals("wizard")){
		System.out.println("You have chosen the Wizard! Excelsior!"); 
	}
	
	else if(x.equals("Warrior") || x.equals("warrior")){
		System.out.println("You have chosen the Warrior! For honor!");
	}
	
	else{
		System.out.println("You've decided not to choose a role. Rerun the program :(");
	}
	
	System.out.println("\nYou have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely!\n");
	
	System.out.print("Strength (1-10): ");
	int strength = sc.nextInt();
	int a = (20-strength);
	if(strength>=0 && strength<=10){
		System.out.println("You have "+a+" left to spend.\n");
	}
	
	else{
		System.out.print("\nYou entered an invalid value. Please input a valid value and restart. ");
		System.exit(0);
	}
	
	System.out.print("Dexterity (1-10): ");
	int dex = sc.nextInt();
	int b = (a-dex);
	if(dex>=0 && dex<=10 && dex<=a){
		System.out.println("You have "+b+" left to spend.\n");
	}
	else{
		System.out.print("\nYou entered an invalid value. Please input a valid value and restart. ");
		System.exit(0);
	}
	
	System.out.print("Intelligence (1-10): ");
	int intel = sc.nextInt();
	int c = (b-intel);
	if(intel>=0 && intel<=10 && intel<=b){
		System.out.println("You have "+c+" left to spend.\n");
		

	}
	else{
		System.out.print("\nYou entered an invalid value. Please input a valid value and restart. ");
		System.exit(0);
	}
	
	System.out.print("Charisma (1-10): ");
	int charisma = sc.nextInt();
	int d = (c-charisma);
	if(charisma>=0 && charisma<=10 && charisma<=c){
		System.out.println("\nYou have "+d+" left to spend for next time.\n");
	}
	else{
		System.out.print("\nYou entered an invalid value. Please input a valid value and restart. ");
		System.exit(0);
	}
	
	System.out.println("--------------------------------------------------");

	System.out.println("You are " + name + " the " + title + ".");
	System.out.println("You're a " + x + " with the following stats!");
	System.out.println("Strength - " + strength);
	System.out.println("Dexterity - " + dex);
	System.out.println("Intelligence - " + intel);
	System.out.println("Charisma - " + charisma);
	
	System.out.print("\nGood luck on your quest, " + name + "!");
	
	}
}
