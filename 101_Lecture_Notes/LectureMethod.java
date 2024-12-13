/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("Emma");
        
        double newSalary = raise(100000.62, 3);
        System.out.println(newSalary);
        
        newSalary = raise(newSalary, 6);
        
	}
	
	public static void printAnimal(){
	    System.out.println("\n /\\_/\\");
        System.out.println("( o.o )");
        System.out.println(" > ^ <");
	}
	
	public static void greeting(String name){
	    System.out.println("\nHello " + name + "!");
	}
	
	private static double raise(double salary, int percent){
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	}
}