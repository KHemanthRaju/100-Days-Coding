class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
//         [1,2,3,1] = [0,1,2,3]
        
//             |0-3| <= 
            
//         [0,2,3] k=1
//         2-0 = 2<=k
//         3-2 = 1<=k
            
//             hashmap
//             ->frequency -> key, value = 1, 2
//             [0,3]
            
//         {1,2,3}
        for(int i=0;i<nums.length;i++){ //n
            for(int j=i+1;j-i<=k && j<nums.length;j++){ //k value
                 if(nums[i]==nums[j]){
                     return true;
                 }
                
            }
        }
        return false;
        
        // Time Complexity:O(nk)
            
            
        
    }
}