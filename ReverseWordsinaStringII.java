class Solution {
    public void reverseWords(char[] s) {
        reverse(s, 0, s.length-1);
        
        int start=0;
        
        for(int i=0; i< s.length-1; i++){
            if(s[i]==' '){
                reverse(s, start, i-1);
                start=i+1;
            }
        }
        reverse(s, start, s.length-1);
        
    }
    
    public void reverse(char[] arr, int start, int end){
        while(start<end){
            char tmp= arr[start];
            arr[start]=arr[end];
            arr[end]=tmp;
            start++;
            end--;
        }
        
        
    }
}
