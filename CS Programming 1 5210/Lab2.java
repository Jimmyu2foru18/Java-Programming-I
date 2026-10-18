/**
 * @author James McGuigan 
 * Lab 2
 * CS 5210
 * 
 */
package Lab2;
import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
		System.out.print( "Enter sales person name: " );
	    String Name = scan.nextLine( );
	    System.out.println( Name );
	     
	    System.out.print( "\nEnter Salesperson's Gross Sales: " );
	    double sales = scan.nextDouble( );
	    System.out.println( sales );
	    
	    double merchandise = 500.0;
	    double precent = 0.07;
	    double totalSold = sales;
	    
	    double earnings = merchandise += (precent *= totalSold);

	    
	    System.out.println( "\n" + Name + " earned " + "$"+ earnings +" dollars this week" );
		
	}

}
