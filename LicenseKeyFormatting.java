class Solution {
    public String licenseKeyFormatting(String S, int K) {
        char[] chArr = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=chArr.length-1; i>=0; i--){
            if(chArr[i]!='-'){
                if(chArr[i] >=97 && chArr[i]<=122){
                    chArr[i]-=32;
                }
                
                if(sb.length()% (K+1) ==K)
                    sb.append('-');
                sb.append(chArr[i]);
                
                
            }
        }
        return sb.reverse().toString();
    }
}
