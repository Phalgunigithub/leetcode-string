class Solution {
    public boolean isPalindrome(String s) {

            String alphanum=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
    StringBuilder str= new StringBuilder(alphanum);
            
        if(alphanum.equals(str.reverse().toString())){
            return true;
        }
        
        else 
            return false;
        
    }
}