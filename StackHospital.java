import java.util.LinkedList;
import java.util.Deque;

public class StackHospital<PatientType> extends Hospital<PatientType> 
{
	private Deque<PatientType> waitList;
	
	StackHospital()
	{
		waitList = new LinkedList<PatientType>();
	}
	
	@Override
	public void addPatient(PatientType patient)
	{
		waitList.addFirst(patient);
	}
	
	@Override
	public PatientType nextPatient()
	{
		return waitList.getFirst();
	}
	
	@Override
	public PatientType treatNextPatient()
	{
		return waitList.removeFirst();
	}
	
	@Override
	public int numPatients()
	{
		return waitList.size();
	}
	
	@Override
	public String hospitalType()
	{
		return "StackHospital";
	}
	
	@Override
	public String allPatientInfo()
	{
		String allInfo = "";
		
		for (Object currInfo : waitList)
		{
			allInfo += currInfo.toString();
		}
		
		return allInfo;
	}
}
