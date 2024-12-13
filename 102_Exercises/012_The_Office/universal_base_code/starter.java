/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.raiseSalary(3);
		michael.employeeToString();
	
	
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.raiseSalary(4);
		dwight.employeeToString();

		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.raiseSalary(4);
		jim.employeeToString();
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.raiseSalary(18);
		pam.employeeToString();
		
		Employee emma = new Employee(7264, "Emma", "Park", 5432.82);
		emma.raiseSalary(200);
		emma.employeeToString();

	

		
	}
}
