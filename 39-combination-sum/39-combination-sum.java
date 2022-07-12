class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList();
        combination(candidates,target,0,ans,new ArrayList<>());
        return ans;
    }
    public void combination(int[] arr,int target,int idx, List<List<Integer>> ans, List<Integer> list ){
        if(idx == arr.length){
            if(target == 0){
                    ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[idx] <= target){
            list.add(arr[idx]);
            combination(arr,target-arr[idx],idx,ans,list);
            list.remove(list.size()-1);
        }
        combination(arr,target,idx+1,ans,list);
    }
}