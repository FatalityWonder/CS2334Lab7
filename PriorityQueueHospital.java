
public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType>
{
	
	
	PriorityQueueHospital()
	{
		
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
