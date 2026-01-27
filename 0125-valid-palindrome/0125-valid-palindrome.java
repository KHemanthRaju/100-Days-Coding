class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            while(l<r && !check(s.charAt(l))){
                l++;
            }
            while(l<r && !check(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!= Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean check(Character ch){
        if(ch>='a' && ch<='z' || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
            return true;
        }
        return false;
    }
}