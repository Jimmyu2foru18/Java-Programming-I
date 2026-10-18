package DecimalFormat;
	
import java.util.Random;

public class DecimalFormat {
	
	public static void main (String [ ] args )
	{
		Random random = new Random ( );
		
		int die = random.nextInt( 6 ) + 1;
		
		System.out.println( "The Next die roll is " + die);
		
		//numb between 20 & 200
		
		int start = 20, end  = 200;
		
		int number = random.nextInt( end - start + 1) + start;
		
		System.out.println( "\nThe random number between " + start + " and " + end + " is " + number);
		
	}

}
