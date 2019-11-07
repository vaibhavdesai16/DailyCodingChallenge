package dailycoding.Challenge8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
	@Test
	public  void testRainStorage1() {
		int[] arr  = {3, 0, 1, 3, 0, 5};
		App app = new App();
		assertEquals(8, app.rainStorage(arr));
	}
	
	@Test
	public  void testRainStorage2() {
		int[] arr  = {2,1,4,0,3,1};
		App app = new App();
		assertEquals(4, app.rainStorage(arr));
	}
}
