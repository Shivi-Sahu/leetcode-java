class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;
        int i =0;

        while(i<n-3){

            if(i>0 && nums[i] == nums[i-1]){
                i++;
                 continue;
            }

          int  k = n-1;
            while(k>i+2){

                if(k< n-1 && nums[k] == nums[k+1]){
                  k--;
                  continue;
                }
             int left = i+1;
                int right= k-1;

                while(left<right){
                    long sum = (long)nums[i] + nums[left] + nums[right] + nums[k];

                  if(sum == target){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right],nums[k]));
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]){
                  left++;
                  }
                  while(left<right && nums[right]== nums[right+1]){
                    right--;
                  }

            }
                         else if( sum<target){
                    left++;
                  }else{
                    right--;
                  


                  }
                  
            }

               k--;
            }
            i++;
        }

        return ans;
    }
}
