class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;
        }
         helper(root);
         return maxSum;
    }
    private int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(0,helper(root.left));
        int right = Math.max(0,helper(root.right));
        int currentPath = left + root.val +right;

        maxSum = Math.max(maxSum, currentPath);
        return root.val + Math.max(left, right);
    }
}
