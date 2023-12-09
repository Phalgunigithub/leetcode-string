class Solution {
    public boolean isPalindrome(String s) {

       String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = new StringBuilder(cleanString).reverse().toString();

        // Check if the original cleaned string is equal to its reversed version
        if (cleanString.equals(reversed)) {
            return true;
        } else {
            return false;  // or return cleanString; or any other meaningful value
        }
        
    }
}