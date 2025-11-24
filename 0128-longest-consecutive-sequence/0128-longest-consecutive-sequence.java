class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        int max = 0;
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
        }
        for(int n:ans){
            if(!ans.contains(n-1)){
                int count = 1;
                while(ans.contains(n+count)){
                    count++;
                }
                max = Math.max(count, max);
            }
            
        }
        return max;
    }
}

// class Solution {
//     public int longestConsecutive(int[] nums) {
//         for(int num:set){
//             if(!set.contains(num-1)){
//                 int length = 1;
//                 while(set.contains(num+length)){
//                     length++;
//                 }
//                 longest = Math.max(longest, length);
//             }
            
//         }
//         return longest;
//     }
// }