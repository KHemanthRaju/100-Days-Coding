class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        HashSet<Integer> seen = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            seen.add(nums[i]);
        }
        for(int num:seen){
            if(!seen.contains(num-1)){
                int count = 1;
                while(seen.contains(num+count)){
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}