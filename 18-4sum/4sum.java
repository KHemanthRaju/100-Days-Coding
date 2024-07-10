class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long ans1 = nums[i]+nums[j];
                int left = j+1;
                int right = nums.length-1;
                while(left < right){
                    long ans2 = nums[left]+nums[right];
                    if(ans1+ans2<target) left++;
                    else if(ans1+ans2>target) right--;
                    else if(ans1+ans2 == target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}