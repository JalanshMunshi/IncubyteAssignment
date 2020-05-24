import org.junit.platform.commons.annotation.Testable;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.Assert;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class StringCalculatorTests {
	
	@Test
	public void EmptyStringReturnsZero()
	{
		StringCalculator calc = new StringCalculator();
		assertEquals(0, calc.Add(""));
	}
	
	@Test
	public void SingleNumberReturnsTheNumberItself()
	{
		StringCalculator calc = new StringCalculator();
		String num = "9";
		assertEquals(9, calc.Add(num));
	}
	
	@Test
	public void TwoNumbersRetursTheirSum()
	{
		StringCalculator calc = new StringCalculator();
		String num = "9,14";
		assertEquals(23, calc.Add(num));
	}
	
	@Test
	public void UnknownNumbersReturnTheirValidSum()
	{
		StringCalculator calc = new StringCalculator();
		Random r = new Random();
		int totalNums = r.nextInt(20), expectedSum = 0;
		String nums = "";
		for(int i=0; i<totalNums; i++)
		{
			int t = r.nextInt(50);
			nums += String.valueOf(t);
			if(i<totalNums-1)
				nums += ",";
			expectedSum += t;
		}
		assertEquals(expectedSum, calc.Add(nums));
	}

}
