/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;


class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" A dense, enchanted forest where ancient trees tower overhead, and the air is thick with mystery.");
        System.out.println("You begin your adventure at a fork in the path.");
        System.out.println("1. Follow the Path to the Left: This path is well-trodden but seems to fade into darkness ahead. Rumors say it leads to a hidden village.");
        System.out.println("2. Take the Path to the Right: This route is overgrown and wild, filled with strange noises and the occasional flash of colorful light. It might lead to a magical creature’s lair.");
        System.out.println("3. Stay and Explore Your Surroundings: You can examine the area around you, looking for clues or items that might help on your journey.");
     
        int answer = sc.nextInt();
        if(answer == 1){
            System.out.println("You choose to follow the path to the left.");
            System.out.println("As you walk, the trees begin to thin, and the sound of laughter fills the air. Eventually, you emerge into a small clearing where you see a quaint village nestled between the trees. The houses are made of woven branches and glowing flowers, and the villagers, with their pointed ears and bright smiles, seem to be celebrating.");
            System.out.println("1. Join the Celebration: You feel drawn to the festivities and wonder if the villagers will welcome you.");
            System.out.println("2. Approach a Villager: You notice an elder sitting on a log, observing the celebration. You could ask her about the forest and its secrets.");
            System.out.println("3. Explore the Village: There are stalls with unusual goods and trinkets. You could wander and see what interesting items you find.");
            
            
        }
        else if(answer == 2){
        
        }
        else if(answer == 3){
            
        }
        else{
            
        }
        
	}
}