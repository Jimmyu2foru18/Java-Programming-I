
public class LearnJava {

	public static void main(String[] args) {
		//primitive types
		int a = 5;
		char b = 'i';
		long c = 400;
		double d = 3.2;
		//non primitive types/ objects
		String name =  "Jimmy";
		name.toUpperCase( );
		System.out.println(name.toUpperCase( ));
		
		addExclamationPoint("Cheers");
	}
	//methods
	public static void addExclamationPoint(String s) {
		
		System.out.println( s + "!");
		
		
	}

}
