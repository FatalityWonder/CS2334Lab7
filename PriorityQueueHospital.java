import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType>
{
	
	private PriorityQueue<PatientType> waitList;
	
	PriorityQueueHospital()
	{
		waitList = new PriorityQueue<PatientType>();
	}
	
	@Override
	public void addPatient(PatientType patient)
	{
		waitList.add(patient);
	}
	
	@Override
	public PatientType nextPatient()
	{
		return waitList.peek();
	}
	
	@Override
	public PatientType treatNextPatient()
	{
		return waitList.poll();
	}
	
	@Override
	public int numPatients()
	{
		return waitList.size();
	}
	
	@Override
	public String hospitalType()
	{
		return "PriorityQueueHospital";
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
