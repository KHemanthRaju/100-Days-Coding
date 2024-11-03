class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combination(candidates,target,0,ans,new ArrayList<>());
        return ans;
    }
    
    public void combination(int[] arr, int target, int ind, List<List<Integer>> ans, List<Integer> ds){
        if(ind == arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            combination(arr,target-arr[ind],ind,ans,ds);
            ds.remove(ds.size()-1);
        }
        
        combination(arr,target,ind+1,ans,ds);
    }
}