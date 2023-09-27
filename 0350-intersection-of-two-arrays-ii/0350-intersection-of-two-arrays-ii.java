class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums2.length < nums1.length){
		    return intersect(nums2, nums1);
	    }   
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<>();
        int leftIndex = 0;
        
        for(int i:nums1){
            int index = binarySearch(nums2,i,leftIndex);
                if(index != -1){
			        result.add(i);
			        leftIndex = index + 1;
		    }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public int binarySearch(int[] nums, int target, int left){
        int right = nums.length-1;
        int index = -1;
        
        while(left<=right){
            int middle = left+(right-left)/2;
            
            if(nums[middle]==target){
                index = middle;
                right = middle-1;
            }else if(nums[middle] > target){
			    right = middle - 1;
		    }else{
                left = middle+1;
            }
        }
        return index;
    }
}