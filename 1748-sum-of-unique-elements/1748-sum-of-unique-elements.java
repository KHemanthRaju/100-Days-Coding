class Solution {
    public int sumOfUnique(int[] nums) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(Integer i:map.keySet()){
            if(map.get(i)==1){
                ans+=i;
            }
        }
        return ans;
    }
}