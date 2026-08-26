class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n= nums.length;
4
5        for (int i =0; i<n;i++){
6            if(nums[i]<=0 || nums[i] >= (n+1)){
7                nums[i] = n+1;
8            }
9        }
10        for(int i = 0; i<n; i++){
11            int element= Math.abs(nums[i]);
12            if(element == n+1 ){
13                continue;
14            }
15            int index = element - 1;
16            if(nums[index] >0){
17                nums[index]= - nums[index];
18            }
19
20        }
21        for(int i =0; i<n; i++){
22            if(nums[i]>0){
23                return i +1;
24            }
25        }
26             return n+1;
27        
28    }
29}

 
