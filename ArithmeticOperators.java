//James McGuigan//

package ArithmeticOperators;

public class ArithmeticOperators {
	public static void main( String [] args )
	{
		double salad = 5.95;
		double water = .89;
		
		System.out.println( "The  cost of lunch is $" + (salad + water));
		
		int targetYear = 2023;
		int birthYear = 1996;
		System.out.println( "\nYour age in " + targetYear + " is " 
							+ (targetYear - birthYear));
		//calories of apples//
		int caloriesPerApple = 127;
		int numberOfApples = 3;
				
			System.out.println( "\nThe calories in " + numberOfApples
						+ " apples is " + (caloriesPerApple * numberOfApples));
						
		//miles per gallon//
		double miles = 426.8;
		double gallons = 15.2;
		double mileage = miles / gallons;
		
		System.out.println( "\nThe mileage is " + mileage + " miles per gallon. ");
			
 		
	}

}
