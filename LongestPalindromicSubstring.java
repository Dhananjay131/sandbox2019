class Solution {
    //String c ="";
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1){
            return"" ;
        }
        int start =0,end=0;
        for(int i =0;i<s.length();i++){
           int l1= searchPallindrome(s,i,i+1);
           int l2 =  searchPallindrome(s,i,i);
            int l = Math.max(l1,l2);
           if(l>end-start){
                start = i-(l-1)/2;
                end = i+l/2;
            }
        }
        
        return s.substring(start,end+1);
    }
    
    private int searchPallindrome(String s, int l,int r){
        
        while((l>=0) && (r<s.length())&& (s.charAt(l)==s.charAt(r))){
            
                l--;
                r++;
            // c= s.substring(l-1,r+1);
            }
        return (r-l-1);
            
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
