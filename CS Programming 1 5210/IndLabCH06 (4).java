/**
 * @author James McGuigan
 * CS 5210
 * Chapter 6 Individual Lab
 * 04/26/2023
 */

 /* Lab Task List:
  * Input an unknown number of employees 
  * Determine and display the gross pay for each employ
  * Company pays straight time for the first 40 hours worked by each employee 
  * Hours x Rate
  * Straight time plus time-and-a-half for all hours worked in excess of 40 hours
  * Input the number of hours worked and hourly rate for each of the employees
  * Determine and display the employee’s gross pay
  * At the end, print the total gross pay for all employees
  * Use the sentinel control Algorithm
  */

package IndLabCH06;

import java.util.Scanner;

public class IndLabCH06 
{
	public static void main(String [] args) 
	{
		double total = 0;
		final int SENTINEL = -1;
		int hours = 0;
		double rate = 0;
		double grossPay = 0;
	
		Scanner scan = new Scanner(System.in);
		System.out.println( "This program determines and displays the gross pay for unknown number of employees " );
   
	 	// 1) Priming Read
    	System.out.print( "\nEnter hours worked, or -1 to stop > " );
    	hours = scan.nextInt( );
    	
    	while ( hours != SENTINEL )		// 2) Test
    	{	
    		// 3) Body
    		System.out.print("Enter Rate of Pay, or -1 to stop > "  );
    	    rate = scan.nextDouble( );
    	      
    	    if (hours <= 40)
    	    grossPay = hours * rate;
    	    
    		if (hours > 40) 
    		grossPay = (rate * 1.5  ) * ( hours - 40 )  + ( 40 * rate );
    		
    		System.out.println( "\nThe Gross Pay for Employee is $" + grossPay );		
    		//Accumulator
    	    total += grossPay; 
    	    
    	    // 4) Repeat Read
    	    System.out.print( "\nEnter hours worked, or -1 to stop > " );
        	hours = scan.nextInt( );
    	}
    	System.out.println( "\nThe Total Gross Pay For all employees is $" + total);
	}
}


