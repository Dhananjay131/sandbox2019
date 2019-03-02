class Solution {
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }
    
    public int sumNumbers(TreeNode root, int sum){
        if(root==null)
            return 0;
        
        if(root.left==null && root.right==null)
            return (sum*10 + root.val);
        
        return sumNumbers(root.left, sum*10 + root.val) + sumNumbers(root.right, sum*10 + root.val);
        
        //previous sum need to be multiplied by 10 at each extra level
        //the + and return takes care of single leaf well
        
    }
}

