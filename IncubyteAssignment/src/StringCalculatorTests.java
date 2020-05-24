import org.junit.platform.commons.annotation.Testable;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;

import org.junit.Test;

public class StringCalculatorTests {
	
	@Test
	public void EmptyStringReturnsZero()
	{
		StringCalculator c = new StringCalculator();
		assertEquals(0, c.Add(""));
	}
	
	@Test
	public void StringWithSingleNumberReturnsTheNumberItself()
	{
		StringCalculator c = new StringCalculator();
		String num = "9";
		assertEquals(9, c.Add(num));
	}

}
