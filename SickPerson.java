
public class SickPerson extends Person
{
	private int severity;
	
	public SickPerson(String name, int age, int severity) 
	{
		super(name, age);
		this.severity = severity;
	}

	@Override
	protected int compareToImpl(Person p) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString()
	{
		
	}

}
