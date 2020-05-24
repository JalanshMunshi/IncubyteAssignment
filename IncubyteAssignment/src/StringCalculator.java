
public class StringCalculator {
	
//	Add function that takes up to 2 numbers
	public int Add(String nums) throws Exception {
		
		if(nums.length() == 0)
			return 0;
		
		int ans = 0;
//		Get the delimiter
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
		{
			int t = Integer.parseInt(s);
			if(t < 0)
				throw new Exception("Negatives like" + Integer.toString(t) + "not allowed.");
			ans += t;
		}
		return ans;
	}

}
