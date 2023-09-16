class Solution {
    public int alternateDigitSum(int n) {
        char[] ch = (""+n).toCharArray();
        int sum = 0;
        for(int i=0;i<ch.length;i++){
            if(i%2==0){
                sum += Integer.parseInt(String.valueOf(ch[i]));
            }else{
                sum-=Integer.parseInt(String.valueOf(ch[i]));
            }
        }
        return sum;
    }
}