/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	Scanner sc = new Scanner (System.in);
	
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;
	
	String role;

	public myCharacter() {
		role = "No role";
		
		strength = 5;
		dexterity = 5;
		intelligence = 5;
		constitution = 5;
		charisma = 5;
	}
	
	public void ask(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.println("Your constitution is " + constitution);
		System.out.println("Your charisma trait is " + charisma);
	}
	
	public void amm(){
		System.out.println("What would you want to be? Wizard, Warrior, or Rogue?: ");
		String role = sc.nextLine();
		
		if(role.equals("Wizard")||role.equals("wizard")){
			System.out.println("You chose to be a wizard!");
			System.out.println("Your role is Wizard");
			System.out.println("Your strength trait is " + strength);
			System.out.println("Your dexterity trait is " + dexterity);
			System.out.println("Your intelligence trait is " + intelligence);
			System.out.println("Your constitution is " + constitution);
			System.out.println("Your charisma trait is " + charisma);
		}
		else if(role.equals("Warrior")||role.equals("warrior")){
			System.out.println("You chose to be a warrior!");
			System.out.println("Your role is Warrior");
			System.out.println("Your strength trait is " + strength);
			System.out.println("Your dexterity trait is " + dexterity);
			System.out.println("Your intelligence trait is " + intelligence);
			System.out.println("Your constitution is " + constitution);
			System.out.println("Your charisma trait is " + charisma);
		}
		else if(role.equals("Rogue")||role.equals("rogue")){
			System.out.println("You chose to be a rogue!");
			System.out.println("Your role is Rogue");
			System.out.println("Your strength trait is " + strength);
			System.out.println("Your dexterity trait is " + dexterity);
			System.out.println("Your intelligence trait is " + intelligence);
			System.out.println("Your constitution is " + constitution);
			System.out.println("Your charisma trait is " + charisma);
		}
		else{
			System.out.println("You've decided not to choose a role. Rerun the program!");
			System.out.println("Your role is " + role);
			System.out.println("Your strength trait is " + strength);
			System.out.println("Your dexterity trait is " + dexterity);
			System.out.println("Your intelligence trait is " + intelligence);
			System.out.println("Your constitution is " + constitution);
			System.out.println("Your charisma trait is " + charisma);
		}
	}

}

