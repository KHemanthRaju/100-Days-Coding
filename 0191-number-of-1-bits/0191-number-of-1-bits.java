public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        int x = 1;
        while(n!=0){
            n&=(n-1);
            count++;
        }
        return count;
    }
}