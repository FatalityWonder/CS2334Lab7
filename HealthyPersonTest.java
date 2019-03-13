import org.junit.Assert;
import org.junit.Test;

public class HealthyPersonTest 
{

	@Test
	public void testCompareToImpl() 
	{
		HealthyPerson h1 = new HealthyPerson("Odin", 17, "Check-Up");
		HealthyPerson h2 = new HealthyPerson("Chris", 26, "Check-Up");
		HealthyPerson h3 = new HealthyPerson("Chris", 39, "Pain");
		HealthyPerson h4 = new HealthyPerson("Angie", 16, "Tooth");

		Assert.assertEquals("Odin".compareTo("Chris"), h1.compareTo(h2));
		Assert.assertEquals("Chris".compareTo("Chris"), h3.compareTo(h2));
		Assert.assertEquals("Angie".compareTo("Chris"), h4.compareTo(h2));
	}

	@Test
	public void testToString() 
	{
		HealthyPerson h1 = new HealthyPerson("Laura", 38, "Check-Up");
		
		Assert.assertEquals("Laura, a 38-year old. In for Check-Up", h1.toString());
	}

	@Test
	public void testHealthyPerson() 
	{
		HealthyPerson h1 = new HealthyPerson("Kara", 48, "Check-Up");
		
		Assert.assertEquals("Kara", h1.getName());
		Assert.assertEquals(48, h1.getAge());
	}

}
