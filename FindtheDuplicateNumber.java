class Solution {
    public int findDuplicate(int[] nums) {
        int tort = nums[0];
        int rab = nums[0];
        
        do{
            tort = nums[tort];
            rab = nums[nums[rab]];
        } while(tort!=rab);
        
        rab = nums[0];
        
        while(rab!=tort){
            tort = nums[tort];
            rab = nums[rab];
        }
        
        return tort;
        
        
    }
}
