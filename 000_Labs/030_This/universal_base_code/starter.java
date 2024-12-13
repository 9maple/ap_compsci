/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	
	public static int randAge(){
		int age = (int)(Math.random()*7+1);
		return age;
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf one = new PooleDwarf(randName(), randAge());
		System.out.println(one.getName() + " is " + one.getAge() + " years old!");
		PooleDwarf two = new PooleDwarf(randName(), randAge());
		System.out.println(two.getName() + " is " + two.getAge() + " years old!");
		PooleDwarf three = new PooleDwarf(randName(), randAge());
		System.out.println(three.getName() + " is " + three.getAge() + " years old!");
		PooleDwarf four = new PooleDwarf(randName(), randAge());
		System.out.println(four.getName() + " is " + four.getAge() + " years old!");
		PooleDwarf five = new PooleDwarf(randName(), randAge());
		System.out.println(five.getName() + " is " + five.getAge() + " years old!");
		PooleDwarf six = new PooleDwarf(randName(), randAge());
		System.out.println(six.getName() + " is " + six.getAge() + " years old!");
		PooleDwarf seven = new PooleDwarf(randName(), randAge());
		System.out.println(seven.getName() + " is " + seven.getAge() + " years old!");
	
		
	int x = 0;
	
	if(one.getName().equals(two.getName())){
		x = x+1;
	}
	if(one.getName().equals(three.getName())){
		x = x+1;
	}
	if(one.getName().equals(four.getName())){
		x = x+1;
	}
	if(one.getName().equals(five.getName())){
		x = x+1;
	}
	if(one.getName().equals(six.getName())){
		x = x+1;
	}
	if(one.getName().equals(seven.getName())){
		x = x+1;
	}
	
	System.out.println();
	System.out.print(one.getName() + " was duplicated " + x + " times!");
	
	}
	
}
