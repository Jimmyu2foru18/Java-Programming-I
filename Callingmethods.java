//James McGuigan

package Callingmethods;

import java.text.SimpleDateFormat;

public class Callingmethods {
	
		public static void main ( String [] args )
		{

			SimpleDate independenceDay = new SimpleDate( 7, 4, 1776 );
			
			int independenceMonth = independenceDay.getMonth( );
			
			System.out.println( "Independence day is in month "
					+ independenceMonth);
		
			SimpleDate nextCentury = new SimpleDate ( 1, 1, 2101 );
			
			System.out.println( "\nThe day for the next Century is " 
									+ nextCentury.getDay( ));
			
			
			nextCentury.setDay ( 2 ); 
			
			System.out.println( "\nThe revised day for the next Century is " 
									+ nextCentury.getDay( ));
		
			SimpleDate programmersDay = new SimpleDate ( 9, 12, 2009);
			
			System.out.println( "\nThe first Programmers Day was " 
									+ programmersDay.getMonth( ) + '/'
									+ programmersDay.getDay( ) + '/'
									+ programmersDay.getyear( ));
			
			programmersDay.nextDay( );
			System.out.println( "\nThe actual date for Programmers Day is "
									+ programmersDay.getMonth( ) + '/'
									+ programmersDay.getDay( ) + '/'
									+ programmersDay.getyear( ));
									
		}

}
