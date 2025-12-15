class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        HashSet<Integer> seen = new HashSet<>();
        for(int num:nums){
            seen.add(num);
        }
        for(int n:seen){
            if(!seen.contains(n-1)){
                int count=1;
                while(seen.contains(n+count)){
                    count++;
                }
                longest = Math.max(longest, count);
            }
            
        }
        return longest;
    }
}