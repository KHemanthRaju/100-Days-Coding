class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        combSum2(candidates,target,0,ans,new ArrayList<>());
        return ans;
    }
    public void combSum2(int[] arr, int target,int idx,List<List<Integer>> ans, List<Integer> list){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;
            
            list.add(arr[i]);
            combSum2(arr,target-arr[i],i+1,ans,list);
            list.remove(list.size()-1);
        }
    }
}