class Solution {
    public int numOfSubarrays(int[] arr) {
       
        
        int even =1;
        int odd =0;
        int count=0;
        int sum =0;
        int mod = 1000000007;
     for(int i =0; i<arr.length; i++){
      int num = arr[i];
      sum = sum + num;
      
      if(sum % 2 == 1){
        count = (count +even) % mod;
        odd++;
      }else{
        count = (count + odd) % mod;
         even++;
        }
     }
     return count;
    }
     
}
