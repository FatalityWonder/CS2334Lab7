
public class SickPerson extends Person
{
	private int severity;
	
	public SickPerson(String name, int age, int severity) 
	{
		super(name, age);
		this.severity = severity;
	}

	@Override
	protected int compareToImpl(Person p) 
	{
		if (p instanceof SickPerson)
		{
			if(this.severity > ((SickPerson)p).severity)
			{
				return ((SickPerson)p).severity - this.severity; 
			}
			else if(this.severity < ((SickPerson)p).severity)
			{
				return ((SickPerson)p).severity - this.severity;
			}
			else if(this.severity == ((SickPerson)p).severity)
			{
				return 0;
			}
		}

		return 0;
	}
	
	public String toString()
	{
		return String.format("%s Severity level %d", super.toString(), this.severity);
	}

}
