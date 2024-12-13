/*
 Notes: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Slot Machine Rules:");
	System.out.println("1. Each player starts with $100.\n2. Input a wager less than your total amount of money.\n3. The slot machine will roll 3 numbers from 1 to 10.");
	System.out.println("   a. If two numbers match, you double your money.\n   b. If three numbers match, you triple your money.\n   c. If none match, you lose your money.");
	System.out.println("\n--------------------------------------------------\n");
	
	int total=100;
	
	while(true){
	System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
	String play = sc.nextLine();

	if(play.equals("Yes")||play.equals("yes")||play.equals("Y")||play.equals("y")){

		
		System.out.print("\nYou have $"+total+". How much would you like to wager?: ");
		int wager = sc.nextInt();
		sc.nextLine();
		
		while(wager <= 0 || wager > total){
		
			if(wager<=0){
				System.out.println("Sneaky! No negatives or 0!\nPlease enter a valid number.");
			}
			else if(wager>total){
				System.out.println("You only have $"+total+"! Please enter a smaller number.");
			}
			System.out.print("\nYou have $"+total+". How much would you like to wager?: ");
			wager = sc.nextInt();
			sc.nextLine();
		}

			int one = (int)(Math.random()*10+1);
			int two = (int)(Math.random()*10+1);
			int three = (int)(Math.random()*10+1);
			System.out.println("\nGreat! Let's play!\nYour rolls are: ");
			System.out.println("_______________________");
			System.out.println(" | "+one+" | "+two+" | "+three+" |");
			System.out.println("_______________________");
		
			if(one==two && two==three){
				total = total+wager*3;
				System.out.println("JACKPOT! Your wager has been tripled!");
				System.out.println("You now have $"+total+".");
			}
		
			else if(one==two || two==three || one==three){
				total = total+wager*2;
				System.out.println("You won! Your wager has been doubled!");
				System.out.println("You now have $"+total+".");
			
			}
	
			else if(one!=two && two!=three && one!=three){
				total = total-wager;
				System.out.println("Didn't win this time, better luck next time!");
				System.out.println("You now have $"+total+".");
				if(total<=0){
				System.out.println("You've run out of money! Thanks for coming! Come back soon!");
				break;
			}
		
		
	}
	}
	else if(play.equals("No")||play.equals("N")||play.equals("no")||play.equals("n")){
		System.out.print("Sad to see you go! You still shave $"+total+" left. Come again soon! Thanks!");
		break;
	}
	else{
		System.out.println("That wasn't quite the answer. Try again.");
	}
	}
	}
}
