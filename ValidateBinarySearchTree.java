class Solution {
    public boolean isValidBST(TreeNode root) {
        //int low = Integer.MIN_VALUE;
        //int high = Integer.MAX_VALUE;
        
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValidBST(TreeNode root, long low, long high){
        
        if(root==null)
            return true;
        if(root.val<=low || root.val>=high)
            return false;
            
            
         return (isValidBST(root.left, low, root.val) && 
            isValidBST(root.right, root.val, high));
       
    }
}
