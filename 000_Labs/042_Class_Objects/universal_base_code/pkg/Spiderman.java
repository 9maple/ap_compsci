/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class Spiderman {
	String name;
	int age;
	String villain;
	
	public Spiderman() {
		name = "Miles Morales";
		age = 11;
		villain = "King Pin";
	}
	
	public Spiderman(String n){
		name = n;
	}
	
	public Spiderman(String n, int a){
		name = n;
		age = a;
	}
	
	public Spiderman(String n, String v){
		name = n;
		villain = v;
	}
	
	public int setAge(int a){
		age = a;
		return age;
	}
	
	public String setVillain(String v){
		villain = v;
		return villain;
	}
	
	public void print(){
		System.out.println("-------------------------------");
		System.out.println("The actor " + name + " is " + age + " years old");
		System.out.println("They play Spiderman who's villain is " + villain);
		System.out.println("-------------------------------");
	}
}
