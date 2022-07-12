class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList();
        cost_1t(candidates,target,0,ans,new ArrayList<>());
        return ans;
    }
    private void cost_1t(int[] arr,int target,int idx, List<List<Integer>> ans, List<Integer> list ){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(arr.length==idx || target<0){
            return;
        }
        cost_1t(arr,target,idx+1,ans,list);
        list.add(arr[idx]);
        cost_1t(arr,target-arr[idx],idx,ans,list);
        list.remove(list.size() - 1);
    }
}