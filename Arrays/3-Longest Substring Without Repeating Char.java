class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxCount = 0;

       HashSet<Character> set = new HashSet<>();
       while(right <s.length()){
        if(!set.contains(s.charAt(right))){
            set.add(s.charAt(right));
            right++;

            maxCount = Math.max(maxCount , set.size());
        }else{
            set.remove(s.charAt(left));
            left++;
        }
       }

           return maxCount;
        
    }
}
