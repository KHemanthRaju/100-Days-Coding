class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int maxNumber = a>b?a:b;
        for(int i=1;i<=maxNumber;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
        
    }
}