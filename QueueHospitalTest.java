import org.junit.Assert;
import org.junit.Test;

public class QueueHospitalTest 
{

	@Test
	public void testNextPatient() 
	{
		QueueHospital<Person> q1 = new QueueHospital<Person>();
		
		SickPerson s1 = new SickPerson("Angie", 31, 8);
		SickPerson s2 = new SickPerson("Angela", 31, 9);
 
		q1.addPatient(s1);
		q1.addPatient(s2);
		
		Assert.assertEquals(s1, q1.nextPatient());
	}

	@Test
	public void testTreatNextPatient() 
	{
		QueueHospital<Person> q1 = new QueueHospital<Person>();
		
		SickPerson s1 = new SickPerson("Angie", 31, 8);
		SickPerson s2 = new SickPerson("Angela", 31, 9);

		q1.addPatient(s1);
		q1.addPatient(s2);
		
		Assert.assertEquals(s1, q1.treatNextPatient());
	}

	@Test
	public void testNumPatients() 
	{
		QueueHospital<Person> q1 = new QueueHospital<Person>();
		
		SickPerson s1 = new SickPerson("Angie", 31, 8);
		SickPerson s2 = new SickPerson("Sandy", 14, 16);

		q1.addPatient(s1);
		q1.addPatient(s2);
		
		Assert.assertEquals(2, q1.numPatients());
	}

	@Test
	public void testHospitalType() 
	{
		QueueHospital<Person> q1 = new QueueHospital<Person>();
		
		Assert.assertEquals("QueueHospital", q1.hospitalType());
	}

	@Test
	public void testAllPatientInfo() 
	{
		QueueHospital<Person> q1 = new QueueHospital<Person>();
		
		SickPerson s1 = new SickPerson("Angie", 31, 8);
		SickPerson s2 = new SickPerson("Angela", 31, 9);

		q1.addPatient(s1);
		q1.addPatient(s2);
		
		Assert.assertEquals("Angie, a 31-year old. Severity level 8Angela, a 31-year old. Severity level 9", q1.allPatientInfo());
	}

	@Test
	public void testQueueHospital() 
	{
		QueueHospital<Person> q1 = new QueueHospital<Person>();
		
		SickPerson s1 = new SickPerson("Angie", 31, 8);
		SickPerson s2 = new SickPerson("Angela", 31, 9);

		q1.addPatient(s1);
		q1.addPatient(s2);
		
		Assert.assertEquals(2, q1.numPatients());
	}

	@Test
	public void testAddPatientObject() 
	{
		QueueHospital<Person> q1 = new QueueHospital<Person>();
		
		q1.addPatient(new SickPerson("Jason", 34, 2));
		
		Assert.assertEquals(1, q1.numPatients());
	}

}
