class Solution {
17    public TreeNode sortedArrayToBST(int[] nums) {
18        return helper(nums,0,nums.length-1);
19
20        
21    }
22    public TreeNode helper(int[] nums,int left,int right)
23    {
24        if(left >right){
25            return null;
26        }
27        int mid = left + (right-left)/2;
28        TreeNode root = new TreeNode(nums[mid]);
29
30        root.left = helper(nums,left,mid-1);
31        root.right = helper(nums,mid+1, right);
32
33        return root;
34    }
35}
