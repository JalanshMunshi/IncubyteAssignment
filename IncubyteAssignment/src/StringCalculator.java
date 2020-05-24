
public class StringCalculator {
	
//	Add function that takes up to 2 numbers
	public int Add(String nums) {
		
		if(nums.length() == 0)
			return 0;
		
		int ans = 0;
		String delimiter = "";
		if(nums.charAt(0)=='/' && nums.charAt(1)=='/')
		{
			delimiter += nums.charAt(2);
			nums = nums.substring(4);
		}
		else
			delimiter = ",|\n";
		
		String[] numbers = nums.split(delimiter);
		for(String s : numbers)
			ans += Integer.parseInt(s);
		return ans;
	}

}
