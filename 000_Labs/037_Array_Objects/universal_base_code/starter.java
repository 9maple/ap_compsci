/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior [] Warrior = new Warrior [100];
		Wizard [] Wizard = new Wizard [100];
		
		for(int i = 0; i < 100; i++){
			Warrior [i] = new Warrior();
			Wizard [i] = new Wizard();
		}
		
		int war = 0;
		int wiz = 0;
		
		while(war<Warrior.length-1 && wiz < Wizard.length-1){
			Wizard[wiz].attack(Warrior[war]);
			
			if(Warrior[war].isDead()){
				war++;
			}
			
			Warrior[war].attack(Wizard[wiz]);
			if(Wizard[wiz].isDead()){
				wiz++;
			}
		}
		
		if (war<99){
			System.out.println("Warriors won with " + (100-(war+1)) + " left in their army.");
		}
		
		if (wiz<99){
			System.out.println("Wizards won with " + (100-(wiz+1)) + " left in their army.");
		}

	}
}
