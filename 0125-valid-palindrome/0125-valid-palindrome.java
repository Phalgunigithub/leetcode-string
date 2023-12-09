class Solution {
    public boolean isPalindrome(String s) {
        
        //convert to alphanumeric ->lowercase
        //stringbuilder obj
        //reverse obj;
        //conv back to string and compare
        

            String alphanum=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
    StringBuilder str= new StringBuilder(alphanum);
            
        if(alphanum.equals(str.reverse().toString())){
            return true;
        }
        
        else 
            return false;
        
    }
}