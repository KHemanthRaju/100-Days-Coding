class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int c:map.values()){
            if(c==1){
                return -1;
            }
            count+= Math.ceil((c+2)/3);
        }
        return count;
    }
}