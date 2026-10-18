/**
 * @author James McGuigan 
 * Cs 5210
 * Prof Dodd
 * Chapter 3B Individual Lab
 * 4/3/2023
 * 
 */

package Chapter03B;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Chapter03B 
{
	public static void main (String [] args)
	{
		 Scanner scan = new Scanner( System.in );
		 
		 DecimalFormat pricePattern = new DecimalFormat( "$0.00" );
		 
		 System.out.print( "How many quarters do you have?  " );
		 double Quarter = scan.nextDouble( );
		 				
		 System.out.print( "How many Dimes do you have? " );
		 double Dimes = scan.nextDouble( );
		 
		 System.out.print( "How many Nickles do you have? " );
		 double Nickles = scan.nextDouble( );
		 
		 if (Quarter == 1.0)
			 Quarter = .25;
		 else if (Quarter >=1.0)
			 Quarter =  (Quarter *= .25);
		
		 if (Nickles == 1.0)
			 Nickles = .05;
		 else if (Nickles >=1.0)
			 Nickles =  (Nickles *= .05);
		
		 if (Dimes == 1.0)
			 Dimes = .10;
		 else if (Dimes >=1.0)
			 Dimes =  (Dimes *= .10);
		 
		 double total;
		 total = (Quarter + Dimes + Nickles);	
		 
		 System.out.println( "\nThe Total ammount of quarters is " + pricePattern.format(Quarter)); 
		 System.out.println( "The Total ammount of Dimess is "+ pricePattern.format(Dimes)); 
		 System.out.println( "The Total ammount of Nickles is " + pricePattern.format(Nickles)); 
		
		 total = (Quarter + Dimes + Nickles);	
		 System.out.println( "\nThe Total ammount of coins are equivelant to " + pricePattern.format( total));
	}
}
