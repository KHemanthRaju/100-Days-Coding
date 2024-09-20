class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(ans.contains(nums[i])){
                return true;
            }
            ans.add(nums[i]);
        }
        return false;
    }
}