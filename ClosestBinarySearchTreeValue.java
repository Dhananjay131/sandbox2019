class Solution {
    
    public int closestValue(TreeNode root, double target) {
        int ret=root.val;
        while(root!=null){
            if(Math.abs(target-root.val)<Math.abs(target-ret))
                ret = root.val;
            
            root = (root.val>target) ? root.left : root.right;  //I struggled to move around the tree and get return values, was never required
                                                                //this line binary search concept
        }
        return ret;
            
    }
}


 
