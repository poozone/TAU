package Lab01;

import static org.junit.Assert.*;
import org.junit.Test;



public class CalculatorTest {

	Calculator calculator = new Calculator();
	
	@Test
	public void addCheck() {
		int sum = calculator.add(1, 2);
		assertEquals(3, sum);
	}
	
	@Test
	public void subCheck() {
		int submission = calculator.sub(5, 3);
		assertEquals(2, submission);
	}
	
	@Test
	public void multiCheck() {
		int multi = calculator.multi(5, 3);
		assertEquals(15, multi);
	}
	
	@Test
	public void divCheck() {
		int division = calculator.div(5, 3);
		assertEquals(1, division);
	}
	
	@Test 
	public void greaterCheck() {
		boolean greater = calculator.greater(1, 5);
		assertFalse(greater);
	}
	
	@Test
	public void zeroDivisionCheck() {
		int zeroDiv = calculator.div(5, 0);
		assertEquals(0, zeroDiv);
	}
	
}
