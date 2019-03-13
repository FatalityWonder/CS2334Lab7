import org.junit.Assert;
import org.junit.Test;

public class SickPersonTest 
{

	@Test
	public void testCompareToImpl() 
	{
		SickPerson s1 = new SickPerson("Jack", 12, 7);
		SickPerson s2 = new SickPerson("Jensen", 19, 4);
		SickPerson s3 = new SickPerson("Jensen", 19, 4);
		SickPerson s4 = new SickPerson("Jensen", 19, 3);
		
		Assert.assertEquals(-3 , s1.compareTo(s2));
		Assert.assertEquals(0 , s3.compareTo(s2));
		Assert.assertEquals(1 , s4.compareTo(s2));

	}

	@Test
	public void testToString() 
	{
		SickPerson s1 = new SickPerson("Angie", 31, 8);

		Assert.assertEquals("Angie, a 31-year old. Severity level 8", s1.toString());
	}

	@Test
	public void testSickPerson() 
	{
		SickPerson s1 = new SickPerson("John", 25, 6);
		
		Assert.assertEquals("John", s1.getName());
		Assert.assertEquals(25, s1.getAge());
	}

}
