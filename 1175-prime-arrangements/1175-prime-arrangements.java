class Solution {
    static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static long fact(int n, long mod){
        long fact = 1;
        for(int i=2;i<=n;i++){
            fact = (fact*i)%mod;
        }
        return fact;
    }
    public int numPrimeArrangements(int n) {
        int mod = (int)1e9+7;
        int count=0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return (int)((fact(count,mod)*fact(n-count,mod))%mod);
    }
}