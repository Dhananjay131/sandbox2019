class Solution {
    private int start, maxLen=0;
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n<2)
            return s;
        
        for(int i=0; i<n-1; i++){
            stretchPal(s,i,i);
            stretchPal(s,i,i+1);
        }
        return s.substring(start, start+maxLen);
    }
    
    public void stretchPal(String s, int lo, int hi){
        while(lo>=0 && hi<s.length() && s.charAt(lo)==s.charAt(hi)){
            //lo and hi check if put afterwards, gives arrayindex exception
            lo--;
            hi++;
        }
        
        if(hi-lo-1 >= maxLen){   //= is optional, will give latest
            start = lo+1;
            maxLen = hi-lo-1;
        }
    }
    
}

//DP but very poor runtime
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(s.length()<2)
            return s;
        boolean[][] dp = new boolean[n][n];
        String res = null;
        
        
        for(int i=n-1; i>=0; i--){
            for(int j=i; j<n; j++){
                dp[i][j] =  s.charAt(i)==s.charAt(j) && (j-i<3 || dp[i+1][j-1]);    
                //if || statement above reversed, gives arrayoutofBoundException
                
                if(dp[i][j] && (res==null || res.length()<j-i+1))
                    res = s.substring(i,j+1);
            }
        }
        return res;
        
        
    }
}
