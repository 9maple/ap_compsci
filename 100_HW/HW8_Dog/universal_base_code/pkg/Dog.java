package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	Scanner sc = new Scanner(System.in);
	
	String name;
	int age;
	String breed;
	boolean isSleeping;
	
	public Dog() {
		name = new String("Clifford");
		age = 3;
		breed = new String("big red dog");
	}
	
	public Dog(String n){
		name = n;
		age = 1;
		breed = new String("dog dog");
	}
	
	public Dog(String n, String b){
		name = n;
		breed = b;
		age = 1;
	}
	
	public Dog(String n, int a){
		name = n;
		age = a;
		breed = new String("dog dog");
	}
	
	public void setName(){
		System.out.print("Dog name?");
		String name = sc.nextLine();
	}
	
	public void setAge(){
		System.out.print("How old is " + name + "?");
		int age = sc.nextInt();
	}
	
	public void setBreed(){
		System.out.print("What breed is " + name + "?");
		String breed = sc.nextLine();
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getBreed(){
		return breed;
	}
	
	public boolean isSleeping(){
		int sleep = (int)(Math.random()*2);
		if(sleep==0){
			isSleeping = true;
		}
		else if(sleep==1){
			isSleeping = false;
		}
		
		return isSleeping;
	}

	
	public void bark(){
		System.out.println(name + " barks! Woof wooooof! :3");
	}

}


