import org.junit.Assert;
import org.junit.Test;

public class ExampleServiceTest {

	@Test
	public void addTest() {
		double result = new ExampleService().add(1, 1);
		Assert.assertEquals(
			Double.doubleToLongBits(2), 
			Double.doubleToLongBits(result)
		);
	}

	@Test
	public void subtractTest() {
		double result = new ExampleService().subtract(1, 1);
		Assert.assertEquals(
			Double.doubleToLongBits(0), 
			Double.doubleToLongBits(result)
		);
	}

	@Test
	public void divideTest() {
		double result = new ExampleService().divide(9, 2);
		Assert.assertEquals(
			Double.doubleToLongBits(4.5), 
			Double.doubleToLongBits(result)
		);
	}

	@Test
	public void multiplyTest() {
		double result = new ExampleService().multiply(3, 3);
		Assert.assertEquals(
			Double.doubleToLongBits(9), 
			Double.doubleToLongBits(result)
		);
	}

}