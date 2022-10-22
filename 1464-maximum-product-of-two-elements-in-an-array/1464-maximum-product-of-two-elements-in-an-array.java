class Solution {
    public int maxProduct(int[] nums) {
        int max1=0;
        int prod;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                prod = (nums[i]-1)*(nums[j]-1);
                if(prod > max1){
                    max1 = prod;
                }
            }
        }
        return max1;
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(int i=0;i<nums.length;i++){
        //     pq.add(nums[i]-1);
        // }
        // int ans = pq.poll()*pq.poll();
        // return ans;
    }
}