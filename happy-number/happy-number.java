class Solution {
    public boolean isHappy(int n) {
        Set<Integer> ans = new HashSet<>();
        while(n!=1){
            if(ans.contains(n)) return false;
            ans.add(n);
            n = sumOfDigits(n);
        }
        
        return true;
    }
    
    public int sumOfDigits(int n){
        int sum=0;
        while(n!=0){
            int digit = n%10;
            sum+=digit*digit;
            n /= 10;
        }
        return sum;
    }
}