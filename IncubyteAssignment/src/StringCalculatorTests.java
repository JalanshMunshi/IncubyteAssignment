import org.junit.platform.commons.annotation.Testable;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;

import org.junit.Test;

public class StringCalculatorTests {
	
	@Test
	public void EmptyStringReturnZero()
	{
		StringCalculator c = new StringCalculator();
		assertEquals(0, c.Add(""));
	}

}
