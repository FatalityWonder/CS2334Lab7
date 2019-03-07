import java.util.LinkedList;
import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital
{
	private Queue<PatientType> waitList;

	QueueHospital()
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
		return "QueueHospital";
	}
	
	@Override
	public String allPatientInfo()
	{
		
	}
}
