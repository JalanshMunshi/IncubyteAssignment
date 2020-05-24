
public class StringCalculator {
	
//	Add function that takes up to 2 numbers
	public int Add(String nums) {
		
		if(nums.length() == 0)
			return 0;
		int ans = 0;
		String[] numbers = nums.split(",");
		for(String s : numbers)
			ans += Integer.parseInt(s);
		return ans;
	}

}
