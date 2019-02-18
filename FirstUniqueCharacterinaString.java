class Solution {
    public int firstUniqChar(String s) {
        // slow LinkedHashMap<Character, Integer> tm = new LinkedHashMap<>(); 
        int result = s.length();
        for(char c = 'a'; c <= 'z'; c++){
            int index = s.indexOf(c);
            if(index != -1 && index == s.lastIndexOf(c)){
                result = Math.min(result, index);
            }
        }
        return result == s.length() ? -1 : result;
        
        
    }
}
