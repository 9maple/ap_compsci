/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and I'll print out every prime until that number: ");
		int n = sc.nextInt();
		printPrimes(n);
	}
	
	public static boolean checkPrime(int n){
		if(n<2){
			return false;
		}
		
		int c = n-1;
	
		while(c>1){
			if(n%c==0){
				return false;
			}
			c--;
		}
		return true;
	}
	
	 public static void printPrimes(int max) {
        int num = 2;  
        while (num<max){
            if (checkPrime(num)){
                System.out.println(num); 
            }
            num++;
        }
    }
}

