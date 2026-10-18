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
		
		// System.out.println("\nThe amount you entered is " + decmialNumber);
		
		System.out.print("\nEnter Interest Rate> " );
		double rateNumber = scan.nextDouble( );
		
		//Interest rate 
		//double rateNumber = decmialNumber *= 100; 
		System.out.println("\nYour intrest rate is " + rateNumber + "%");

		//formula for values
	    
		double futureValue1 = decmialNumber * Math.pow(1 + rateNumber ,5);
		
		System.out.println("\nYour future value in 5 years is " + numb.format(futureValue1));
	   // DecimalFormat futNumber1 = new DecimalFormat( "#.##%" );
	
		double futureValue2 = decmialNumber * Math.pow(1 + rateNumber ,10);
		
		System.out.println("\nYour future value in 10 years is " + numb.format(futureValue2));
	   // DecimalFormat futNumber1 = new DecimalFormat( "#.##%" );

		
		double futureValue3 = decmialNumber * Math.pow(1 + rateNumber ,20);
		
		System.out.println("\nYour future value in 20 years is " + numb.format(futureValue3));
	   // DecimalFormat futNumber1 = new DecimalFormat( "#.##%" );

		
		
		/*
		// 5 years
		double year5 = 5.0;
		//Math.pow(futureValue, year5);
		System.out.println("\nYour future value in 5 years is " + futureValue + "%");
		// 10 years 
		double year10 = 10.0;
		double futureValue2 = Math.pow(futureValue, year10);
		System.out.println("\nYour future value in 10 years is " + futureValue2 + "%");
		// 20 years
		double year20 = 20.0;
		double futureValue3 =  Math.pow(futureValue, year20);
		System.out.println("\nYour future value in 20 years is " + futureValue3 + "%");
		*/

	}

}
