class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        int sum1 = 0;
        for(Integer i : nums){
            set1.add(i);
            sum1+=i;
        }
        int sum2 =0;
        for(Integer i : set1){
            sum2+=i;
        }
        return 2*sum2 - sum1;
    }
}