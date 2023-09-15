class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        String str = x+"";
        String ans = "";
        int l = 0;
        int r = str.length()-1;
        while(l<=r){
            char ch1 = str.charAt(l);
            char ch2 = str.charAt(r);
            if(ch1 != ch2){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}