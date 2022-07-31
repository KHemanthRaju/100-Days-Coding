class Solution {
    public int fib(int n) {
        return helper(n,new HashMap<>());
    }
    
    public int helper(int n,HashMap<Integer,Integer> memo){
        if(n==1) return 1;
        if(n==0) return 0;
        
        if(memo.containsKey(n)) return memo.get(n);
        
        int helper1 = helper(n-1,memo);
        int helper2 = helper(n-2,memo);
        
        memo.put(n,helper1+helper2);
        
        return memo.get(n);
    }
}