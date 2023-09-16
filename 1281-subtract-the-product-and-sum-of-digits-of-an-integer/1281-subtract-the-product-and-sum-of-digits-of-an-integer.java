class Solution {
    public int subtractProductAndSum(int n) {
        char[] ch = (""+n).toCharArray();
        int prod = 1;
        int sum = 0;
        for(int i=0;i<ch.length;i++){
            prod *= Integer.parseInt(String.valueOf(ch[i]));
            sum += Integer.parseInt(String.valueOf(ch[i]));
        }
        return prod - sum;
    }
}