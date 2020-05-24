
public class StringCalculator {
	
//	Add function that takes up to 2 numbers
	public int Add(String nums) {
		
		if(nums.length() == 0)
			return 0;
		int ans = 0;
		char[] numChars = nums.toCharArray();
		for(int i=0; i<nums.length(); i++)
		{
			if(numChars[i]>='0' || numChars[i]<='9')
				ans += numChars[i] - '0';
		}
		return ans;
	}

}
