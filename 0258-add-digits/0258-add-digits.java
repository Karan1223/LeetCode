class Solution {
    public int addDigits(int num) {
        int sum =0 ;
        if(num>9)
		{
			int digit1 = num%10;
			int digit2 = num/10;
			sum = digit1+digit2;
  return addDigits(sum);
        }
        
        // If num is a single digit, return it
        return num;
    }
}