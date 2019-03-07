import java.util.LinkedList;
import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital<PatientType>
{
	private Queue<PatientType> waitList;

	QueueHospital()
	{
		waitList = new LinkedList<PatientType>();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void addPatient(Object patient)
	{
		waitList.add((PatientType) patient);
	}
	
	@Override
	public PatientType nextPatient()
	{
		return waitList.peek();
	}
	
	@Override
	public PatientType treatNextPatient()
	{
		return waitList.remove();
	}
	
	@Override
	public int numPatients()
	{
		return waitList.size();
	}
	
	@Override
	public String hospitalType()
	{
		return "QueueHospital";
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
