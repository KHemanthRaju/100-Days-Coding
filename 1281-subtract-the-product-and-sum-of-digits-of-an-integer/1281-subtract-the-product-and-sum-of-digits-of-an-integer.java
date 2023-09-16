class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum=0;
        while(n!=0){
            prod *= n%10;
            sum += n%10;
            n=n/10;
        }
        // char[] ch = (""+n).toCharArray();
        // int prod = 1;
        // int sum = 0;
        // for(int i=0;i<ch.length;i++){
        //     prod *= Integer.parseInt(String.valueOf(ch[i]));
        //     sum += Integer.parseInt(String.valueOf(ch[i]));
        // }
        return prod - sum;
    }
}