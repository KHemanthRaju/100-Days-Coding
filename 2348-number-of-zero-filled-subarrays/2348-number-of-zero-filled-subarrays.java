class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long countZeros=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countZeros++;
            }
            else{
                ans += countZeros*(countZeros+1)/2;
                countZeros=0;
            }
        }
        if(countZeros!=0) ans+= (countZeros*(countZeros+1)/2);
        return ans;
    }
}