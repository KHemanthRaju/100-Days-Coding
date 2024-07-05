class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(Integer i:nums1){
            set.add(i);
        }
        List<Integer> result = new ArrayList<>();
        
        for(int i:nums2){
            if(set.contains(i)){
                result.add(i);
                set.remove(i);
            }
        }
        int resultArray[] = new int[result.size()];
        for(int i=0;i<result.size();i++){
            resultArray[i]=result.get(i);
        }
        return resultArray;
    //     Set<Integer> set1 = new HashSet<Integer>();
    //     for(Integer n:nums1) set1.add(n);
    //     Set<Integer> set2 = new HashSet<Integer>();
    //     for(Integer n:nums2) set2.add(n);
    //     set2.retainAll(set1);
    //     int[] output = new int[set2.size()];
    //     int j=0;
    //     for(int i:set2){
    //         output[j++]=i;
    //     }
    //     return output;
    }
}