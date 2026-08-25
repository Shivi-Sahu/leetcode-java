class Solution {
    public TreeNode mergeTrees(TreeNode p, TreeNode q) {
        if(p == null)
        return  q;
        if(q == null)
        return p;

       TreeNode root = new TreeNode(p.val + q.val);

       root.left = mergeTrees(p.left,q.left);
       
       
    

       root.right = mergeTrees(p.right,q.right);

       return root;




    }
}
