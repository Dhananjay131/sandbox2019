class Solution {
    public int firstUniqChar(String s) {
         
        int result = s.length();
        for(char c = 'a'; c <= 'z'; c++){
            int index = s.indexOf(c);
            if(index != -1 && index == s.lastIndexOf(c)){
                result = Math.min(result, index); //index being the least, starting from left of string
            }
        }
        return result == s.length() ? -1 : result;
        
        
    }
}
