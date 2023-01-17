class Solution {
    public int minFlipsMonoIncr(String s) {
        int cnt0 = 0, cnt1 = 0;
        for (char x : s.toCharArray()) {
            if (x == '0') cnt0 += 1;
            else cnt1 += 1;
            cnt0 = Math.min(cnt0, cnt1);
        }
        return cnt0;
    }
}