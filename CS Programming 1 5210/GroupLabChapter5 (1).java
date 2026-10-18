/**
 * @author James McGuigan
 * CS 5210
 * Chapter 5 Group Lab Assignment
 * 4/13/2023
 * Group 1
 */
package GroupLabChapter5;

/*	Instructions:
 * Program that takes two int's input from the keyboard
 * 	for hits & at at-bats for a batter.
 * 
 * 	Then Calculate the batters hitting percentage 
 *	check if percentage is over .300.
 *
 * 	If it is print the player is eligible for the All Stars Game.
 * 
 * 	If Not the player is not eligible for the All Stars Game.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class GroupLabChapter5 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner( System.in );
		DecimalFormat Format = new DecimalFormat( "0.000" );
		
		//Variables
		int ATBAT;
		int HITS;
		double percentage=0;
		
		System.out.println("Enter number of hits : ");
		HITS = scan.nextInt();
		
		System.out.println("Enter number of at-bat : ");
		ATBAT = scan.nextInt();
	
		percentage = ((float)HITS/ATBAT);
		
		System.out.println("\nThe players batting average is " + Format.format(percentage));
		
		//if/else statement to test of percentage is below .300
		if(percentage > 0.300)
			System.out.println("\nPlayer is eligible for the All Stars Game.");
		else
			System.out.println("\nPlayer is not eligible for the All Stars Game.");
		
	}
}


