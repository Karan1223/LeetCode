class Solution {
    public String longestCommonPrefix(String[] strs) {
    	String prefix = strs[0]; // Start with the first string as the prefix
		
		for(int i=0;i<strs.length;i++)
		{
			if(strs[i].length()>prefix.length())
			{
				prefix = strs[i];
			}
			
		}
		 

	        for (int i = 0; i < strs.length; i++) {
	        	
	            while (strs[i].indexOf(prefix) != 0) {
	                prefix = prefix.substring(0, prefix.length() - 1);
	                System.out.println("Prefix: " + prefix);
	                if (prefix.isEmpty()) {
	                    
	                    return "";
	                }
	            }
	        }

	        return prefix;
    }
}