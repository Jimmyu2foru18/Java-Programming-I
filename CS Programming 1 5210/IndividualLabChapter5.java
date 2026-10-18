/**
 * @author James McGuigan
 * CS 5210 
 * Individual Lab
 * 4/17/2023
 */
package IndividualLabChapter5;

/* reads a temperature as a whole number 
 * output a “probable” season (winter, spring, summer, or fall)depending on the temp.
 * greater than or equal to 90 summer
 * greater than or equal to 70 and less than 90 spring
 * greater than or equal to 50 and less than 70 fall
 * temperature is less than 50 winter
 * "It is probably"
 * greater than 110 or less than -5 the temperature entered is outside the valid range
 */

import java.util.Scanner;

public class IndividualLabChapter5 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter in the temperature ");
		
		int Season = scan.nextInt( );
		
		if( Season >= 111)
			System.out.println("\nThe temperature entered is outside the valid range");
		else if ((Season >= 90) && (Season <=110))
			System.out.println("\nIt is probably Summer");
		else if((Season <= 89) && (Season >=70))
			System.out.println("\nIt is probably Spring");
		else if((Season <= 69) && (Season >=50))
			System.out.println("\nIt is probably Fall");
		else if((Season <= 49) && (Season >=-5))
			System.out.println("\nIt is probably winter");
		else if (Season <= -6)
			System.out.println("\nThe temperature entered is outside the valid range");

	}

}
