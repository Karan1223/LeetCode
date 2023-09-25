class Solution 
{
    public boolean isPalindrome(String s) 
    {
     
 String text = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		 int left = 0;
	    int right = text.length()-1;
	    boolean result = true;
        if(left == right)
        {
            result = true;
        }
        else
        {
            while(left<right)
	    {
	        if(text.charAt(left)!=text.charAt(right))
	        {
	            result = false;
	        }
	        left++;
	        right--;
	    }
        }
	    
	    
	    return result;
    }
}