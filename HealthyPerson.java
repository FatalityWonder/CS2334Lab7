
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
		if (p instanceof HealthyPerson)
		{
			if(this.getName().toLowerCase().compareTo(p.getName().toLowerCase()) < 0)
			{
				return this.getName().toLowerCase().compareTo(p.getName().toLowerCase());
			}
			else if(this.getName().toLowerCase().compareTo(p.getName().toLowerCase()) > 0)
			{
				return this.getName().toLowerCase().compareTo(p.getName().toLowerCase());
			}
			else if(this.getName().toLowerCase().compareTo(p.getName().toLowerCase()) == 0)
			{
				return 0;
			}
		}

		return 0;
	}
	
	public String toString()
	{
		return String.format("%s In for %s", super.toString(), this.reason);
	}

}
