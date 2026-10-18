/**
 * @author James McGuigan
 * CS 5210
 * Prof. Dodd
 * Ind. Lab Chapter 3  
 */
package Chapter3Lab;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter3Lab {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		DecimalFormat numb = new DecimalFormat( "$0.00" );
		
		//amount to enter
		System.out.print("Enter an Ammount > " );
		double decmialNumber = scan.nextDouble( );
		
		//entered decimal interest rate
		System.out.print("\nEnter Interest Rate > " );
		double rateNumber = scan.nextDouble( );
	
		//Interest rate as percent
		double IR = rateNumber * 100; 
		System.out.println("\nYour intrest rate is " + IR + "%");

		//formula for values
	   
		//5 years
		double futureValue1 = decmialNumber * Math.pow(1 + rateNumber ,5);
		System.out.println("\nYour future value in 5 years is " + numb.format(futureValue1));
		//10 years
		double futureValue2 = decmialNumber * Math.pow(1 + rateNumber ,10);
		System.out.println("\nYour future value in 10 years is " + numb.format(futureValue2));
		//20 years
		double futureValue3 = decmialNumber * Math.pow(1 + rateNumber ,20);
		System.out.println("\nYour future value in 20 years is " + numb.format(futureValue3));
	}

}
