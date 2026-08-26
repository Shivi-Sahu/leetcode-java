class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);

    }
    private boolean helper(TreeNode root, TreeNode min ,   TreeNode max){
        if(root==null){
            return true;
        }

        if(min != null && root.val<= min.val)
        {
            return false;
        }

        if(max != null && root.val >= max.val){
            return false;
        }
        if (! helper(root.left,min,root)){
            return  false;
        }

        if(!helper(root.right,root,max)){
            return false;
        }
        return true;
    }
}
