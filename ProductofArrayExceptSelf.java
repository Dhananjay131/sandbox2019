class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] res = new int[l];
        int left=1, right=1;
        
        for(int i=0; i<l; i++){
            res[i]=1;
        }
        
        for(int i=0; i<l; i++){
            res[i]*=left;
            left*=nums[i];
        }
        
        for(int i=l-1; i>=0; i--){
            res[i]*=right;
            right*=nums[i];
        }
        
        return res;
    }
    
}
