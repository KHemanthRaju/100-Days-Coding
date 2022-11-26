class Solution {
    
    public int climbStairs(int n) {
        return helper(0,n,new HashMap<Integer,Integer> ());
    }
    
    public int helper(int curr,int target,HashMap<Integer,Integer> memo){
        if(curr == target) return 1;
        if(curr>target) return 0;
        
        int current = curr;
        
        if(memo.containsKey(current)) return memo.get(current);
        
        int onestep = helper(curr+1,target,memo);
        int twostep = helper(curr+2,target,memo);
        
        memo.put(current,onestep+twostep);
        
        return memo.get(current);
    }
}