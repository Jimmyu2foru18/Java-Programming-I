package CharacterMethods;

//Jimmy McGuigan

import java.util.Scanner;

public class CharacterMethods {
	
	public static void main(String [ ] args)
	{
		Scanner scan = new Scanner ( System.in );
		
		System.out.println( "Enter a character > ");
		String input = scan.next( );
		char c = input.charAt( 0 );
		
		System.out.println( "\nThe Unicode decmal value of " + c + " is "
							+ ( int ) c );
		System.out.println( "\n" + c + " is a digit: " 
							+ Character.isDigit( c ));
		
		System.out.println( "\n" + c + " is a letter: "
							+ Character.isLetter( c ));
		
		System.out.println( "\n" + c + " is uppercase: "
				+ Character.isUpperCase( c ));
		
		System.out.println( "\n" + c + " is lowercase: "
				+ Character.isLowerCase( c ));

		System.out.println( "\n" + c + " in uppercase: "
				+ Character.toUpperCase( c ));
		
		System.out.println( "\n" + c + " in lowercase: "
				+ Character.toLowerCase( c ));
		
		
	}

}
