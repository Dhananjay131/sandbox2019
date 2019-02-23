class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int max=0;
        int sum=0;
        
        for(int i=0; i<nums.length; i++){
            
            sum = sum + nums[i];
            
            if(sum==k)
                max=i+1;
            
            else if(hm.containsKey(sum-k)){
                max = Math.max(max,i-hm.get(sum-k));
            }
            
            if(!hm.containsKey(sum))
                hm.put(sum, i);
        }
        return max;
    }
}
