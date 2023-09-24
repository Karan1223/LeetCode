class Solution {
    public int strStr(String haystack, String needle) {
			String sub="";
			int num=0;
        if(haystack.contains(needle))
				{
					for(int i=0;i<=haystack.length()-needle.length();i++)
					{
					sub = haystack.substring(i,i+needle.length());
					if(sub.equals(needle))
					{
						num=i;
						return i;
					}
					}
					return num;
				}
				else
				{
					return -1;
				}
    }
}