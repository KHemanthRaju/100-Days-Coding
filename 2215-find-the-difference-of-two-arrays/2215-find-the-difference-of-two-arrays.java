class Solution {
    
    public List<Integer> getElementsOnlyInFirstList(int[] nums1, int[] nums2) {
        Set<Integer> ans = new HashSet<>();
        for(int num:nums1){
            boolean exists = false;
            for(int x:nums2){
                if(x==num){
                    exists = true;
                    break;
                }
            }
            if(!exists){
                ans.add(num);
            }
        }
        return new ArrayList<>(ans);
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getElementsOnlyInFirstList(nums1, nums2), getElementsOnlyInFirstList(nums2, nums1));
    }
}