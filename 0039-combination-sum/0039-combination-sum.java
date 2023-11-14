class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        solve(0, candidates, target, ans, output);
        return ans;
    }
    
    public void solve(int index, int[] A, int target, List<List<Integer>> ans, List<Integer> output){
        if(target == 0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(index==A.length || target<0){
            return;
        }
        output.add(A[index]);
        solve(index,A,target-A[index], ans, output);
        output.remove(output.size()-1);
        solve(index+1, A, target, ans, output);
        
    }
}