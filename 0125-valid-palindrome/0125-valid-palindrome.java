class Solution 
{
    public boolean isPalindrome(String s) 
    {
// Remove non-alphanumeric characters and convert to lowercase
        String cleanedS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned string is equal to its reverse
        return cleanedS.equals(new StringBuilder(cleanedS).reverse().toString());
    }
}