class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                flag=true;
            }
            else{
                m.put(nums[i],1);
            }
        }
        return flag;
    }
}