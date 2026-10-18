/*JAmes McGuigan */

package StringProcessing;

public class StringProcessing {

	public static void main( String[] args )
	{
		String invertedName = "lincon, abraham";
		
		int comma = invertedName.indexOf(',');
				
			System.out.println("\nThe index of ',' in \"" 
					+ invertedName + "\" is " + comma);
		
		String lastName = invertedName.substring( 0, comma);
		
			System.out.println("the last name is " + lastName);
			
		String firstName = invertedName.substring(comma + 2);
			
			System.out.println("the first name is " + firstName);
			
		//first name //	
		String firstNameStart = firstName.substring(0,1);
			
			firstNameStart	=	firstNameStart.toUpperCase( );
			
			String firstNameRemainder =
		firstName.substring(1);
			
			firstNameRemainder =
		firstName.toLowerCase( );
		
			firstName = firstNameStart + firstNameRemainder;
		//last name//
			String lastNameStart = lastName.substring(0,1);
			
			lastNameStart	=	lastNameStart.toUpperCase( );
			
			String lastNameRemainder =
		lastName.substring(1);
			
			lastNameRemainder =
		lastName.toLowerCase( );
		
			lastName = lastNameStart + lastNameRemainder;
			
	String fullName = firstName + " " + lastName;
		System.out.println ( "\nThe formatted full name is "
				+ fullName );
		
	}
}
