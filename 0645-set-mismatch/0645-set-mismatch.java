class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int current=nums[i]-1;
            if(nums[i]!=nums[current]){
                int temp=nums[i];
                nums[i]=nums[current];
                nums[current]=temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
}