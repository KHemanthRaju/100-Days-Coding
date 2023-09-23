class Solution {
    public int countBits(int n){
        int count = 0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
    
    public boolean isPrime(int n){
        if(n==2) return true;
        if(n<2||n%2==0) return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i=left;i<=right;i++){
            int x = countBits(i);
            if(isPrime(x)){
                count++;
            }
        }
        return count;
    }
}