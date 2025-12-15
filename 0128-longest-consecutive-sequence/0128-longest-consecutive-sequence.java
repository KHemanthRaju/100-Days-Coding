class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        HashSet<Integer> seen = new HashSet<>();
        for(int num:nums){
            seen.add(num);
        }
        for(int i=0;i<seen.size();i++){
            if(!seen.contains(nums[i]-1)){
                int count=1;
                while(seen.contains(nums[i]+count)){
                    count++;
                }
                longest = Math.max(longest, count);
            }
            
        }
        return longest;
    }
}