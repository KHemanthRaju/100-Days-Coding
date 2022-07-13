class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        comb(n,k,1,ans,new ArrayList<>());
        return ans;
    }
    
    public void comb(int n,int k,int start,List<List<Integer>> ans,List<Integer> list){
        if(k==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=start;i<=n;i++){
            list.add(i);
            comb(n,k-1,i+1,ans,list);
            list.remove(list.size()-1);
        }
    }
}