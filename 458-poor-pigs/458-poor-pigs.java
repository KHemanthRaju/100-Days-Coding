class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int T = minutesToTest/minutesToDie;           
        return (int)Math.ceil(Math.log(buckets)/Math.log(T+1));
    }
}