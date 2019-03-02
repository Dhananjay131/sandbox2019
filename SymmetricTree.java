class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        Queue<TreeNode> que = new LinkedList<>();
        if(root==null)
            return true;
        // if(root.left==null && root.right==null) return true;
        // if(root.left==null || root.right==null) return false;
        que.add(root.left);
        que.add(root.right);
        
        while(!que.isEmpty()){
            TreeNode left = que.poll();
            TreeNode right = que.poll();
            
            if(left==null && right==null) continue;       //...null 13 13 null, 14 null 15, true stops further execution
                                                          //way to go, hence use continue
            if(left==null || right==null) return false;
            
            if(left.val!=right.val) return false;
            
            que.add(left.left);
            que.add(right.right);
            que.add(left.right);
            que.add(right.left);
            
        }
        
        
        
        return true;
        
        
    }
}
