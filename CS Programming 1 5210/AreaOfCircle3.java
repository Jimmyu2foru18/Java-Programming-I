/* Calculate the area of a circle
   Anderson, Franceschi
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfCircle3
{
  public static void main( String [] args )
  {
	 Scanner scan = new Scanner( System.in );
	 DecimalFormat pricePattern = new DecimalFormat( "0.00" );

     // define the data we know
	  final double PI = 3.14159;

     // define other data we will use
	  // double radius = 3.5;

	 System.out.print( "\nEnter Radius > " );
     	 double radius = scan.nextDouble( );
     	 System.out.println( "The radius is " + radius );

	  // perform the calculation and store the result
	  double area = PI * radius * radius;

	  // output the result
	  System.out.println( "The area of the circle is " + pricePattern.format( area) );
  }
}