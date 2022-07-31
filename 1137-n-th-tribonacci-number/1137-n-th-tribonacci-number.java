class Solution {
    public int tribonacci(int n) {
        return helper(n,new HashMap<>());
    }
    
    public int helper(int n,HashMap<Integer,Integer> memo){
        if(n<=1) return n;
        if(n==2) return 1;
        
        if(memo.containsKey(n)) return memo.get(n);
        
        int helper1 = helper(n-1,memo);
        int helper2 = helper(n-2,memo);
        int helper3 = helper(n-3,memo);
        
        memo.put(n,helper1+helper2+helper3);
        
        return memo.get(n);
    }
}