
public class HealthyPerson extends Person 
{
	
	private String reason;
	
	public HealthyPerson(String name, int age, String reason) 
	{
		super(name, age);
		this.reason = reason;
	}
	
	@Override
	protected int compareToImpl(Person p) 
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString()
	{
		
	}

}
