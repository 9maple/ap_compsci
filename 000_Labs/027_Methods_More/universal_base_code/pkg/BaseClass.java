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
	boolean last;

  
	public BaseClass() {

		role = new String("no role");
    	strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}

	public BaseClass(String r, int s, int d, int i, int c) {

		role = r;
		strength = s;
		dexterity = d;
		intelligence = i;
		charisma = c;

	}

	public void myToString(){
    	System.out.println("------------------------------");
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.println("Your charisma trait is " + charisma);
		System.out.println("------------------------------");
		System.out.println("");
	}
   
	public String setRole(String role)
{
	if(role.equals("Wizard") || role.equals("wizard"))
{
		return role;
}
	else if (role.equals("Warrior") || role.equals("warrior"))
{
		return role;
}
	else if (role.equals("Rogue") || role.equals("Rogue"))
{
		return role;
}
	else
{
	role = "no role";
	return role;
}

}

	public boolean check(int s, int d, int i, int c)
{
		if(s >= 0 && d >= 0 && i >= 0 && c >= 0)
{
			last = true;
			return last;
}
		else
{
			last = false;
			return last;
}
}

}

