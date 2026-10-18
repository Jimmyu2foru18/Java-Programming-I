/**
 * @author James McGuigan, Jenifer Bonilla, Jayden Huang
 * Prof. Dodd
 * CS 5210
 * Date: 3/1/2023
 * Group 1
 */
package LabClass6;
public class LabClass6
{
	public static void main(String[] args) 
	{
	    // Establish the String for the words
		String s1 = new String("BobRoss");
	    String s2 = "BillyMays";
		// Establish the length of the words
	    int len1 = s1.length( );
	    int len2 = s2.length( );
	    //determine the shorter word and the numeric value of digits
	    if (len1 < len2) //then
	    System.out.println(s1 + " is the shorter word. The length of the word is " + len1);
	    else
	    System.out.println(s2 + " is the shorter word. The length of the word is " + len2);	
	}
}