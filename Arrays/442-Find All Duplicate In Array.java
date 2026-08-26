class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List <Integer> result = new ArrayList<>();
        for(int i =0; i< nums.length; i++){
            int currentNumber= Math.abs(nums[i]);

            int index = currentNumber-1;

            if(nums[index] <0){
                result.add(currentNumber);

            }else{
                nums[index] = - nums[index];
            }
        }
        return result;
    }
}
