import org.junit.Assert;
import org.junit.Test;

public class ExampleServiceTest {

	@Test
	public void addTest() {
		double result = ExampleService.add(1, 1);
		Assert.assertEquals(
			Double.doubleToLongBits(2), 
			Double.doubleToLongBits(result)
		);
	}
	
	@Test
	public void subtractTest() {
		double result = ExampleService.subtract(1, 1);
		Assert.assertEquals(
			Double.doubleToLongBits(0), 
			Double.doubleToLongBits(result)
		);
	}

}