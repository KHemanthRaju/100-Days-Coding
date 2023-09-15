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
        while(x!=0){
            int rem = x%10;
            ans+=rem;
            x = x/10;
        }
        return str.equals(ans);
    }
}