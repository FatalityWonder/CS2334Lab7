import java.util.LinkedList;
import java.util.Deque;

public class StackHospital<PatientType> extends Hospital 
{
	private Deque<PatientType> waitList;
	
	StackHospital()
	{
		waitList = new LinkedList<PatientType>();
	}
	
	@Override
	public void addPatient(Object patient)
	{
		
	}
	
	@Override
	public PatientType nextPatient()
	{
		
	}
	
	@Override
	public PatientType treatNextPatient()
	{
		
	}
	
	@Override
	public int numPatients()
	{
		
	}
	
	@Override
	public String hospitalType()
	{
		return "StackHospital";
	}
	
	@Override
	public String allPatientInfo()
	{
		
	}
}
