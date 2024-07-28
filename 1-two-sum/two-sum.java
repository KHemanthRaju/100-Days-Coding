class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 1st way   brute force
        // int[] ans = new int[2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j] == target){
        //             ans[0]=i;
        //             ans[1]=j;
        //         }
        //     }
        // }
        // return ans;
        
        //2nd way using HashMap
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
                
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}