import org.junit.Assert;
import org.junit.Test;

public class PriorityQueueHospitalTest 
{

	@Test
	public void testAddPatient() 
	{
		PriorityQueueHospital<Person> pQ1 = new PriorityQueueHospital<Person>();
		
		pQ1.addPatient(new SickPerson("Jason", 34, 2));
		
		Assert.assertEquals(1, pQ1.numPatients());
	}

	@Test
	public void testNextPatient()
	{
		PriorityQueueHospital<Person> pQ1 = new PriorityQueueHospital<Person>();
		
		SickPerson s1 = new SickPerson("Angie", 31, 8);
		SickPerson s2 = new SickPerson("Angela", 31, 9);

		pQ1.addPatient(s1);
		pQ1.addPatient(s2);
		
		Assert.assertEquals(s2, pQ1.nextPatient());
	}

	@Test
	public void testTreatNextPatient() 
	{
		PriorityQueueHospital<Person> pQ1 = new PriorityQueueHospital<Person>();
		
		SickPerson s1 = new SickPerson("Angie", 31, 8);
		SickPerson s2 = new SickPerson("Rick", 41, 19);

		pQ1.addPatient(s1);
		pQ1.addPatient(s2);
		
		Assert.assertEquals(s2, pQ1.treatNextPatient());
	}

	@Test
	public void testNumPatients() 
	{
		PriorityQueueHospital<Person> pQ1 = new PriorityQueueHospital<Person>();
		
		SickPerson s1 = new SickPerson("Angie", 31, 8);
		SickPerson s2 = new SickPerson("Sandy", 14, 16);

		pQ1.addPatient(s1);
		pQ1.addPatient(s2);
		
		Assert.assertEquals(2, pQ1.numPatients());
	}

	@Test
	public void testHospitalType() 
	{
		PriorityQueueHospital<Person> pQ1 = new PriorityQueueHospital<Person>();
		
		Assert.assertEquals("PriorityQueueHospital", pQ1.hospitalType());
	}

	@Test
	public void testAllPatientInfo() 
	{
		PriorityQueueHospital<Person> pQ1 = new PriorityQueueHospital<Person>();
		
		SickPerson s1 = new SickPerson("Angie", 31, 8);
		SickPerson s2 = new SickPerson("Angela", 31, 9);

		pQ1.addPatient(s1);
		pQ1.addPatient(s2);
		
		Assert.assertEquals("Angela, a 31-year old. Severity level 9Angie, a 31-year old. Severity level 8", pQ1.allPatientInfo());
	}

	@Test
	public void testPriorityQueueHospital() 
	{
		PriorityQueueHospital<Person> pQ1 = new PriorityQueueHospital<Person>();
		
		SickPerson s1 = new SickPerson("Angie", 31, 8);
		SickPerson s2 = new SickPerson("Angela", 31, 9);

		pQ1.addPatient(s1);
		pQ1.addPatient(s2);
		
		Assert.assertEquals(2, pQ1.numPatients());
	}

}
