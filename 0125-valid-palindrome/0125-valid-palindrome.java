class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }
        int left = 0;
        int right = s.length()-1;
        while(left<=right){
            while(left < right && !isAlphaNum(s.charAt(left))){
                left++;
            }while(left < right && !isAlphaNum(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isAlphaNum(Character ch){
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch >= '0' && ch <='9')){
            return true;
        }
        return false;
    }
    
}