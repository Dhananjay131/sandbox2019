class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length-1);
    }
        
        
    public TreeNode constructMaximumBinaryTree(int[] nums, int low, int high){
        
        if(low>high)
            return null;
        
        
        int index=low;
        //low+=1;                       //don't makechanges in given data. instead use new variables to iterate
        for(int i=low+1; i<=high; i++){
            if(nums[i]>nums[index]){
                index = i;
            }
        }
        TreeNode root  = new TreeNode(nums[index]);
        root.left = constructMaximumBinaryTree(nums, low, index-1);
        root.right = constructMaximumBinaryTree(nums, index+1, high);
        
        
        return root;
    }
}

