package Gift;

public class Gift {
	
	private String description;
	private double price;
	private String occasion;
	private boolean taxable;
	
	public static final double TAX_RATE = 0.05;
	
	public Gift ( String d, double p, String o, boolean t )
	{
		description = d;
		price = p;
		occasion = o;
		taxable = t;
	}
		public void setPrice( double p )
		{
			price = p;
		}
		public void setTaxable( boolean t )
		{
			taxable = t;
		}
	}
