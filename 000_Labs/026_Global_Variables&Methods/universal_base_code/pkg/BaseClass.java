/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;

	public BaseClass() {
		role = ("No role");
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	
	public BaseClass(String r){
		if(r.equals("Wizard")||r.equals("wizard")){
			role = "Wizard";
			strength = 3;
			dexterity = 7;
			intelligence = 6;
			charisma = 4;
		}
		
		else if(r.equals("Warrior")||r.equals("warrior")){
			role = "Warrior";
			strength = 8;
			dexterity = 6;
			intelligence = 2;
			charisma = 4;
		}
		
		else if(r.equals("Rogue")||r.equals("rogue")){
			role = "Rogue";
			strength = 2;
			dexterity = 2;
			intelligence = 3;
			charisma = 3;
		}
		
		else{
			role = "No role";
			strength = 0;
			dexterity = 0;
			intelligence = 0;
			charisma = 0;
		}
	
	}
	
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterity is " + dexterity);
		System.out.println("Your intelligence is " + intelligence);
		System.out.println("Your charisma is " + charisma);
	}

}

