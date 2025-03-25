class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()<=1) return true;
        String st = "";
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || (ch >= '0' && ch <= '9')) st+=ch;
        }
        String st1=st.toLowerCase();
        System.out.println(st1);
        int i=0, j = st1.length()-1;
        while(i<=j){
            if(st1.charAt(i)!=st1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}