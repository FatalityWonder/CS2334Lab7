import org.junit.Assert;
import org.junit.Test;

public class StackHospitalTest 
{

	@Test
	public void testNextPatient() 
	{
		StackHospital<Person> pQ1 = new StackHospital<Person>();
		
		SickPerson s1 = new SickPerson("Angie", 31, 8);
		SickPerson s2 = new SickPerson("Angela", 31, 9);

		pQ1.addPatient(s1);
		pQ1.addPatient(s2);
		
		Assert.assertEquals(s2, pQ1.nextPatient());
	}

	@Test
	public void testTreatNextPatient() 
	{
		StackHospital<Person> sh1 = new StackHospital<Person>();
		
		SickPerson s1 = new SickPerson("Angie", 31, 8);
		SickPerson s2 = new SickPerson("Angela", 31, 9);

		sh1.addPatient(s1);
		sh1.addPatient(s2);
		
		Assert.assertEquals(s2, sh1.treatNextPatient());
	}

	@Test
	public void testNumPatients() 
	{
		StackHospital<Person> sh1 = new StackHospital<Person>();
		
		SickPerson s1 = new SickPerson("Angie", 31, 8);
		SickPerson s2 = new SickPerson("Angela", 31, 9);

		sh1.addPatient(s1);
		sh1.addPatient(s2);
		
		Assert.assertEquals(2, sh1.numPatients());
	}

	@Test
	public void testHospitalType() 
	{
		StackHospital<Person> sh1 = new StackHospital<Person>();
		
		Assert.assertEquals("StackHospital", sh1.hospitalType());
	}

	@Test
	public void testAllPatientInfo() 
	{
		StackHospital<Person> sh1 = new StackHospital<Person>();

		SickPerson s1 = new SickPerson("Angie", 31, 8);
		SickPerson s2 = new SickPerson("Angela", 31, 9);

		sh1.addPatient(s1);
		sh1.addPatient(s2);
		
		Assert.assertEquals("Angela, a 31-year old. Severity level 9Angie, a 31-year old. Severity level 8", sh1.allPatientInfo());
	}

	@Test
	public void testStackHospital() 
	{
		StackHospital<Person> sh1 = new StackHospital<Person>();

		SickPerson s1 = new SickPerson("Angie", 31, 8);
		SickPerson s2 = new SickPerson("Angela", 31, 9);

		sh1.addPatient(s1);
		sh1.addPatient(s2);
		
		Assert.assertEquals(2, sh1.numPatients());
	}

	@Test
	public void testAddPatientObject() 
	{
		StackHospital<Person> sh1 = new StackHospital<Person>();
		
		sh1.addPatient(new SickPerson("Jason", 34, 2));
		
		Assert.assertEquals(1, sh1.numPatients());
	}

}
