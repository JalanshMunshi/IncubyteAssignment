import org.junit.platform.commons.annotation.Testable;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.Assert;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class StringCalculatorTests {
	
	private StringCalculator calc = new StringCalculator();
	
	@Test
	public void EmptyStringReturnsZero()
	{
		assertEquals(0, calc.Add(""));
	}
	
	@Test
	public void SingleNumberReturnsTheNumberItself()
	{
		String num = "9";
		assertEquals(9, calc.Add(num));
	}
	
	@Test
	public void TwoNumbersRetursTheirSum()
	{
		String num = "9,14";
		assertEquals(23, calc.Add(num));
	}
	
	@Test
	public void UnknownNumbersReturnTheirValidSum()
	{
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
	
	@Test
	public void NewLineDelimeterReturnValidSum()
	{
//		StringCalculator calc = new StringCalculator();
		String nums = "5\n6,7\n8\n1";
		assertEquals(27, calc.Add(nums));
	}

}
