class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hash.add(nums[i]);
        }
        int longestLength=0;
        for(int i=0;i<nums.length;i++){
            if(hash.contains(nums[i]-1)==false){
                int currElement = nums[i];
                int currLength = 1;
                while(hash.contains(currElement+1)){
                    currLength+=1;
                    currElement+=1;
                }
                longestLength = Math.max(longestLength,currLength);
            }
        }
        return longestLength;
    }
}