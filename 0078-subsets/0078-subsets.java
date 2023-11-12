class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> output = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,0,output,ans);
        return ans;
    }
    
    public void solve(int[] nums, int i, List<Integer> output, List<List<Integer>> ans){
        
        if(i == nums.length){
            ans.add(new ArrayList<Integer>(output));
            return;
        }
        
        output.add(nums[i]);
        solve(nums,i+1,output,ans);
        output.remove(output.size()-1);
        solve(nums,i+1,output, ans);
    }
}